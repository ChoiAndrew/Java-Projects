/*
 * Andrew CHoi
 * 
 * Reservation class for Reservation HW
 * 
 * 03/16/219
 */

public class Reservation implements Comparable
{
    private String customer;
    private int timeslot;
    private String sourceId;
    //private Table myTable;

    /*
     * Constructor for Reservation class that takes a
     * name and time. Sets the variables.
     */
    public Reservation(String customerName, int timeslot)
    {
        this.customer = customerName;
        this.timeslot = timeslot;
    }

    /*
     * A getter for the Customer
     */
    public String getCustomer()
    {
        return this.customer;
    }

    /*
     * A getter for time 
     */
    public int getTime()
    {
        return this.timeslot;
    }

    /*
     * toSTring the returns the customer and the time 
     */
    public String toString()
    {
        return  "Reservation: " + this.customer + " Time: " + this.timeslot;
    }
    
    /*
     * This method is to return the sourceId which 
     * is used in the resManager class. 
     */
    public String getSourceId()
     {
         return this.sourceId;
         
        }
    
        /*
         * A setter for sourceId which is also used in the 
         * resManage class.
         */
    public void setResourceID(String id)
    {
        this.sourceId = id;
      }

    /*
    public Table getTable()
    {
        return this.myTable;
    }
   
    public void setTable(Table newTable)
    {
        this.myTable = newTable;
    }
    */
   
   /*
    * The compareTO override for the comparable inplementation.
    * COmpares the Strings.
    */
    @Override
    public int compareTo(Object o)
    {
        Reservation that = (Reservation)o;

        if(this.customer.compareTo(that.customer) == 0)
        {
            return 0;
        }
        else if(this.customer.compareTo(that.customer) > 0)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }

    

}
