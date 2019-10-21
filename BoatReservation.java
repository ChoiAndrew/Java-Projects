import java.util.ArrayList;
/*
 * Andrew CHoi
 * 
 * Boat Reservation class for Reservation HW
 * 
 * 03/16/219
 */
public class BoatReservation extends Reservation
{
     private ArrayList<String> preferences = new ArrayList<>();
     /*
     * The BoatReservation constructor that takes in the customerName 
     * and time
     *
     */
    public BoatReservation(String customerName, int timeslot) {
        super(customerName, timeslot);
        
    }

    /*
     * addBoatPreference adds the preference to the array list.
     */
    public void addBoatPreference(String boatName)
    {
        preferences.add(boatName);
    }
    
    /*
     * Here in this method you return the preferences int he 
     * array list.
     */
    public ArrayList<String> getPreferences()
    {
        ArrayList<String> copy = new ArrayList<>(preferences);
        
        return copy;
    
   }
}