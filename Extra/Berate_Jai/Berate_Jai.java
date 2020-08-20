/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Berate_Jai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TourPackage pkg[] = new TourPackage[10];
     
        
        Scanner sc = new Scanner(System.in);
        int offer;
       
        for (int i = 0; i < 10; i++) {
            System.out.println("1");
            pkg[i] = new TourPackage();
            pkg[i].setPackage(i, "A_" + i, (i + 1) * 500, "Jannuary", " ");
        }

        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Country: ");
        String country = sc.nextLine();

        Travelers t = new Travelers();
        t.set(0, name, country);
       
        for (int i = 0; i < 10; i++) {
            pkg[i].showPackage();
        }
        System.out.println("Select Package: (press 0 - 9)");
        int c = sc.nextInt();
        sc.nextLine();

        if (pkg[c].capacity == 0) {
            System.out.println("Sorry No Offer Left");
            return;
        }

        System.out.println("Are you registred??(y/n)");
        String c1 = sc.nextLine();
         
       
        if (c1.equals("y")) {
 
            offer = (pkg[c].package_price * 20) / 100;
            System.out.println("Total Cost: " + (pkg[c].package_price - offer));
        } else if (c1.equals("n")) {
            offer = (pkg[c].package_price * 2) / 100;
            System.out.println("Total Cost: " + (pkg[c].package_price + offer));

        }
       pkg[c].capacity--;
       t.setPackage(pkg[c]);
         
        t.showInfo();
    }

}
