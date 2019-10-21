/*
 * Andrew CHoi
 * 
 * Restaurant Reservation class for Reservation HW
 * 
 * 03/16/219
 */
public class RestaurantReservation extends Reservation
{
	private int numSeatsNeeded;
	/*
	 * The RestaurantReservtion constructor 
	 * that takes in the name, number of seats needed and the 
	 * time.
	 */
     public RestaurantReservation(String name,  int numSeatsNeeded, int startTime)
     {
    	 super(name , startTime);
    	 this.numSeatsNeeded = numSeatsNeeded;
    	 
     }

     /*
      * A getter for the number of seats needed.
      */
     public int getNumSeatsNeeded() 
	{
		return numSeatsNeeded;
	}
	
	
    

     
	
}