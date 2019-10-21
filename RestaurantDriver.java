
//package ReservationSystem;
/*
 * Andrew CHoi
 * Reservation System homework
 * CSS143
 * 
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Driver for Restaurant Reservations
 */
public class RestaurantDriver {
    /*
     * This is the main method to test the code.
     * It reads from the file and makes the reservation 
     * based on the other classs.
     */
    public static void main(String[] args) {
       
        ResManager<Table, Reservation> manager = new ResManager<Table, Reservation>();
        try {

            Scanner scanner = new Scanner(new FileInputStream("tableFile.txt"));

            while (scanner.hasNext())
            {				
                //Table tab = new Table (scanner);
                manager.addReservable(new Table (scanner));				
            }
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            System.exit(0);
        }

        //	manager.printItems();  // debugging code, prints list of Tables

        RestaurantReservation r1 = new RestaurantReservation("Chen family",2,3);
        manager.makeReservation(r1);
        RestaurantReservation r2 = new RestaurantReservation( "Singh party", 8,4);
        manager.makeReservation(r2);                             //Id:Seats:time
        r2 = new RestaurantReservation("Kal",8, 4);
        manager.makeReservation(r2);
        r2 = new RestaurantReservation( "business1", 8, 4);
        manager.makeReservation(r2);
        RestaurantReservation r3 = new RestaurantReservation("Newmans", 2, 2);
        manager.makeReservation(r3);

        r2 = new RestaurantReservation("TooBig" , 11, 4 );
        manager.makeReservation(r2);
        r2 = new RestaurantReservation( "party5", 10, 4);
        manager.makeReservation(r2);
        r3 = new RestaurantReservation( "party6", 10, 4);
        manager.makeReservation(r3);
        r3 = new RestaurantReservation("overflow",10, 4);
        manager.makeReservation(r3);

        System.out.println("Listing of reservations:");
        System.out.println(manager);

        System.out.println("\nSorted reservations");
        manager.sortReservations();
        System.out.println(manager);

    }

}

