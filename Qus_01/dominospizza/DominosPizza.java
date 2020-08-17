/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominospizza;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class DominosPizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner sc = new Scanner(System.in);
         int id,phoneNumber;
         String name,address;
         
         System.out.println("Enter Id: ");
         id = sc.nextInt();
         sc.nextLine();
         System.out.println("Enter Name: ");
         name = sc.nextLine();
         System.out.println("Enter Address: ");
         address = sc.nextLine();
         System.out.println("Enter Phone Number: ");
         phoneNumber = sc.nextInt();
         
         Customer obj1 =  new Customer(id,name,address,phoneNumber);
        
        
         System.out.println("Please Enter What you want 1 for Pizza 2 for Drinks");
         int t = sc.nextInt();
        
        
         int id1;
         double price1;
         String name1,flavorName1;
        
        if(t==1){

            System.out.println("Pizza Id: ");
            id1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Pizza Name: ");
            name1 = sc.nextLine();
            System.out.println("Pizza Flavor: ");
            flavorName1 = sc.nextLine();
            System.out.println("Pizza Price: ");
            price1 = sc.nextDouble();
            
            Pizza p = new Pizza();
            p.set(id1,price1,name1,flavorName1);
            p.display();
        }
        else if(t==2){
               
            System.out.println("Drinks Id: ");
            id1 = sc.nextInt();
            sc.nextLine();
            System.out.println("Drinks Name: ");
            name1 = sc.nextLine();
            System.out.println("Drinks Brand: ");
            flavorName1 = sc.nextLine();
            System.out.println("Drinks Price: ");
            price1 = sc.nextDouble();
            
            Pizza p = new Pizza();
            p.set(id1,price1,name1,flavorName1);
            p.display();
        }
        
    }
    
}
