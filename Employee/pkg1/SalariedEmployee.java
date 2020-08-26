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
public class SalariedEmployee extends Employee {

    public SalariedEmployee(double wage) {
        super(wage);
    }

    @Override
    public void printDetails() {
            System.out.println("The Salary of SalariedEmployee is "+super.wage);
    }

}
