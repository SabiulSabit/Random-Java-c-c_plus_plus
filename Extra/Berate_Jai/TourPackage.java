/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

/**
 *
 * @author USER
 */
public class TourPackage {
     int package_id,package_price;
     static int capacity=10;
     String month,season,packdge_name;
    
    
    public void setPackage(int package_id,String packdge_name,int package_price,String month,String season){
        this.package_id = package_id;
        this.packdge_name = packdge_name;
        this.package_price = package_price;
        this.month = month;
        this.season = season;
    }
    
    public void showPackage(){
        System.out.println("ID: "+this.package_id);
        System.out.println("Name: "+this.packdge_name);
        System.out.println("Price: "+this.package_price);
        System.out.println("Capacity: "+this.capacity);
        System.out.println("Month: "+this.month);
        System.out.println("Season: "+this.season);
    }
    
    
}
