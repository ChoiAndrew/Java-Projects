import java.util.Scanner;
/*
 * Andrew CHoi
 * 
 * ReservableItem class for Reservation HW
 * 
 * 03/16/219
 */
/*
 * represents an item that can be reserved

 */
public abstract class ReservableItem
{
    //Either table or boat name
    protected String id;
    //10 available time slots
    public static final int timeSlots = 10;
    private boolean[] availability = new boolean[10];

    /*
     * ReservableItem constructor that reads from the file
     * and sets the id
     */
    public ReservableItem( Scanner fileIn)
    {
        if(fileIn.hasNextLine())
        {
           setId(fileIn.next());
        }
    }
   
    /*
     * A getter for the ID;
     */
    public String getId() 
    {
        return this.id;
    }

    /*
     * ABstract method that is later used in Table and Boat classes
     * to find best fit
     */
    public abstract int getFitnessVaue(Reservation res);

    /*
     * A getter for the getTimeArray to determine which 
     * reservations are available
     */
    public boolean[] getTimeArray()
    {
        boolean[] availability = new boolean[10];
        for(int i = 0; i < availability.length; i++)
        {
            availability[i] = this.availability[i];
        }
        return availability; 
    }

    /*
     * This method is to change the array index from false to
     * true.
 
     */
    public void full(int i)
    {
        availability[i] = true;
    }

    /*
     * A setter for id that takes in 
     * a String
     */
    public void setId(String id) {
        this.id = id;
    }

    
}
