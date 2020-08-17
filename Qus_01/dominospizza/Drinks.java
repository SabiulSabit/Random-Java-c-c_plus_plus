/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominospizza;

/**
 *
 * @author USER
 */
public class Drinks {
    
    private int id;
    private double price;
    private String name,brandName;
            
     public void set(int id,double price,String name,String brandName){
        this.id=id;
        this.price=price;
        this.name=name;
        this.brandName=brandName;
    }
    
     public void display(){
        System.out.println("Pizza Name: "+name);
        System.out.println("Pizza Brand: "+brandName);
        System.out.println("Pizza Price: "+price);
    }
}
