/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

import pkg1.Employee;

/**
 *
 * @author USER
 */
public class HourlyEmployee extends Employee {
    int hours;

    public HourlyEmployee(double wage) {
        super(wage);
    }

    public void printDetails() {
        System.out.println("The Salary of CommissionEmployee is "+(super.wage*hours));    
    }
}
