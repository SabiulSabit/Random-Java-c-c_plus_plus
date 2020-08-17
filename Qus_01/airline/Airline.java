/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline;

/**
 *
 * @author USER
 */
public class Airline {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ReservationSystem obj1 = new ReservationSystem();
       ReservationSystem obj2 = new ReservationSystem();
       
       obj1.bookSeats("First Class");
       obj1.showStatus();
       
       obj2.bookSeats("Economy Class");
       obj2.showStatus();
       
    }
    
}
