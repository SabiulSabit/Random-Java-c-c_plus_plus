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
public class ReservationSystem {
    public static int firstClass=10,economyClass=10;
    
    public void bookSeats(String classType){
        if(classType=="First Class" && firstClass >0 ){
            firstClass--;
            return;
        }
        if(classType=="Economy Class" && economyClass >0 ){
            economyClass--;
            return;
        }
        System.out.println("All seats are booked, Next flight leaves in 2 hours.");
    } 
    
    public void showStatus(){
        System.out.println("\nFirst Class Available: "+firstClass+"\nEconomy Class Available: "+economyClass);
    }
}
