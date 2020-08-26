/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

/**
 *
 * @author USER
 */
public abstract class Employee {
    
    public double wage;
     
    public Employee(double wage){
        this.wage = wage;
    }
    
    public abstract void printDetails();
}
