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
public class Travelers {
    private int tid;
    private String country,tname;
    private TourPackage pkg;
    
    public void set(int tid,String tname,String country){
        this.tid = tid;
        this.tname = tname;
        this.country = country;
    }
    
    public void setPackage(TourPackage pkg){
        this.pkg = pkg;
    }
    
    public void showInfo(){
        System.out.println("ID: "+this.tid);
        System.out.println("Name: "+this.tname);
        System.out.println("Country: "+this.country);
        System.out.println("Package Info: ");
        this.pkg.showPackage();
    }
    
}
