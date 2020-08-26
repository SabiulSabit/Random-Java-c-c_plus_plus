/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg3;

import pkg1.Employee;

/**
 *
 * @author USER
 */
public class CommissionEmployee extends Employee {
    double commission;
    
    
    public CommissionEmployee(double wage){
        super(wage);
    }
   

    
    public void printDetails() {
        System.out.println("The Salary of CommissionEmployee is "+(super.wage*super.wage*commission));
    }
}
