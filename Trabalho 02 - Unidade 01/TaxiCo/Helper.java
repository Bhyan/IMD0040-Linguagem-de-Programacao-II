/**
 * The test class Helper.
 * Provides the beginning of a set of tests for program development.
 *
 * @author  Bryan Brito
 * @version 05.09.2018
 */
public class Helper 
{
	private TaxiCo taxiCo1;

    /**
     * Default constructor for test class Helper
     */
    public Helper()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
	protected void setUp()
	{
		taxiCo1 = new TaxiCo("IMD's cars");
		taxiCo1.addTaxi();
		taxiCo1.addTaxi();
		taxiCo1.addShuttle();
	}

    public void testWhatToCatch(){
        setUp();
        Taxi taxi = (Taxi)taxiCo1.lookup("Car #1");
        Shuttle shuttle = (Shuttle)taxiCo1.lookup("Shuttle #3");
        shuttle.arrived();

        System.out.println(taxiCo1.whatToCatch("Canterbury West"));
/*        if("Shuttle #3".equals(taxiCo1.whatToCatch("Canterbury West").getID())){
            System.out.println("Test whatToCatch #2 passed.");
        }
        if("Car #1".equalsIgnoreCase(taxiCo1.whatToCatch("Canterbury West").getID())){
            System.out.println("Test whatToCatch #1 passed.");
        }
*/
    }

    /**
     * Test whether we can book a taxi.
     */
	public void testBook()
	{
		setUp();
		Taxi taxi1 = (Taxi)taxiCo1.lookup("Car #1");		
		taxi1.book("HIPER");
		if ("HIPER".equalsIgnoreCase(taxi1.getDestination()) ) {
			System.out.println("Test book passed.");
		} else { 
			System.out.println("Teste book failed.");
		}
	}

	/**
	 * Test the status of a taxi after it has arrived.
	 */
	public void testArrived()
	{
		setUp();
		Taxi taxi1 = (Taxi)taxiCo1.lookup("Car #1");
		taxi1.book("HIPER");
		taxi1.arrived();
		if ( taxi1.getDestination() == null && "HIPER".equalsIgnoreCase(taxi1.getLocation()) ) {
			System.out.println("Test arrived passed.");
		} else { 
			System.out.println("Teste arrived failed.");
		}
	}

	public static void main(String[] args) {
		Helper helper = new Helper();
		helper.testBook();
		helper.testArrived();
        helper.testWhatToCatch();
	}
}
