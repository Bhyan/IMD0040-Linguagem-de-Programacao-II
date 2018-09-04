import java.awt.Color;
import java.awt.Rectangle;
import java.awt.Dimension;
import java.util.Vector;
import java.util.Random;

/**
 * Class BallDemo - provides a demonstration of the
 * BouncingBall and Canvas classes. 
 *
 * @author Michael Kolling and David J. Barnes
 * @version 2010.11.30
 */

public class BallDemo   
{
    private Canvas myCanvas;
    private static final int WIDTH = 600;
    private static final int HEIGHT = 500;

    /**
     * Create a BallDemo object.
     * Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", WIDTH, HEIGHT);
        myCanvas.setVisible(true);
    }
 
    /**
     * Simulate n bouncing balls
     * @param quantity_ amount of balls created
     */
    public void bounce(int quantity_){
        if(quantity_ <= 0){
            System.out.println("Input invalid.");
            System.exit(1);
        }
        else{
            Random rand = new Random();
            Dimension dim = myCanvas.getSize();

            myCanvas.setVisible(true);

            // position of the floor line at 99% of the canvas size
            int ground = (int)(dim.height * 0.99);
            // x-limit of the ground line
            int xLimit = dim.width - 50;

            // draw the ground
            myCanvas.erase();
            myCanvas.setForegroundColor(Color.blue);
            myCanvas.drawLine(50, ground, xLimit, ground);

            Vector<BouncingBall> balls = new Vector<BouncingBall>();

            Color[] color = {Color.black, Color.blue, Color.orange,
                    Color.cyan, Color.gray, Color.green, Color.magenta,
                    Color.pink, Color.red, Color.yellow};

            // create balls with random size, position and colors
            for(int i = 0; i < quantity_; i++){
                int xStart = rand.nextInt(dim.width);
                int yStart = rand.nextInt(dim.height / 4);
                int size = rand.nextInt(20) + 16;
                int ballColor = rand.nextInt(10);

                BouncingBall ball = new BouncingBall(xStart, yStart, size, color[ballColor], 
                        ground, myCanvas);
                ball.draw();
                balls.add(ball);
            }

            // make them bounce until both have gone beyond the xLimit.
            while(!balls.isEmpty()){
                for(int i = 0; i < balls.size(); i ++){
                    myCanvas.wait(25);
                    balls.get(i).move();

                    if(balls.get(i).getXPosition() >= xLimit){
                        balls.get(i).erase();
                        balls.remove(i);
                    }
                }
            }
        }
    }
    
    /**
     * Draw rectangle on canvas
     */
    public void drawFrame(){
        Dimension dim = myCanvas.getSize();

        myCanvas.setVisible(true);
        myCanvas.setForegroundColor(Color.blue);

        Rectangle rec = new Rectangle(20 , 20, dim.width - 40, dim.height - 40);

        myCanvas.erase();

        rec.setLocation(20, 20);
        myCanvas.draw(rec);

        myCanvas.fill(rec);
    }
}
