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
public class Customer {
    private int id,phoneNumber;
    private String name,address;
    
    
    Customer(int id,String name,String address ,int phoneNumber){
        this.id=id;
        this.name = name;
        this.address =  address;
        this.phoneNumber= phoneNumber;
    }
}
