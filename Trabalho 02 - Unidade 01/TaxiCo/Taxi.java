/**
 * A taxi.
 * Taxis have a unique ID, a location and sometimes a destination.
 * They are either free or occupied.
 * 
 * @author David J. Barnes 
 * @version 2010.12.03
 */
public class Taxi extends Vehicle{
    // Whether it is free or not.
    private boolean free;

    /**
     * Constructor for objects of class Taxi.
     * @param base The name of the company's base.
     * @param id This taxi's unique id.
     */
    public Taxi(String base, String id)
    {
        super(id);
        super.setLocation(base);
        free = true;
    }
    
    /**
     * Book this taxi to the given destination.
     * The status of the taxi will no longer be free.
     * @param destination The taxi's destination.
     */
    public void book(String destination)
    {
        super.setDestination(destination);
        free = false;
    }

    /**
     * Return the status of this taxi.
     * @return The status.
     */
    public String getStatus()
    {
        return super.getID() + " at " + super.getLocation() + " headed for " +
               super.getDestination();
    }
    
    /**
     * Return the ID of the taxi.
     * @return The ID of the taxi.
     */
    public String getID()
    {
        return super.getID();
    }
    
    /**
     * Return the location of the taxi.
     * @return The location of the taxi.
     */
    public String getLocation()
    {
        return super.getLocation();
    }
    
    /**
     * Return the destination of the taxi.
     * @return The destination of the taxi.
     */
    public String getDestination()
    {
        return super.getDestination();
    }
    
    /**
     * Indicate that this taxi has arrived at its destination.
     * As a result, it will be free.
     */
    public void arrived()
    {
        super.setLocation(super.getDestination());
        super.setDestination(null);
        free = true;
    }
}
