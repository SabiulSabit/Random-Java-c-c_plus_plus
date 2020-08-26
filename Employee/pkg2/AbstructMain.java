/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

import pkg1.Employee;
import pkg1.SalariedEmployee;
import pkg1.pkg3.CommissionEmployee;

/**
 *
 * @author USER
 */
public class AbstructMain {
    
    public static void main(String args[]){
        Employee employess[] = new Employee[3];
        
        employess[0] = new SalariedEmployee(6.5);
        employess[1] = new CommissionEmployee(7.5);
        employess[2] = new HourlyEmployee(8.5);
        
        employess[0].printDetails();
        employess[1].printDetails();;
        employess[2].printDetails();;
    }
}
