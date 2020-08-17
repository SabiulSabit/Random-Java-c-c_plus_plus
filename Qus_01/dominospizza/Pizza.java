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
public class Pizza {
    private int id;
    private double price;
    private String name,flavorName;
    
    public void set(int id,double price,String name,String flavorName ){
        this.id=id;
        this.price=price;
        this.name=name;
        this.flavorName=flavorName;
    }
}
