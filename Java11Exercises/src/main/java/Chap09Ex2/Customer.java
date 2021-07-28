/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09Ex2;

/**
 *
 * @author jaden
 */
public class Customer {
    private String name;
    private String ssn;
    private String surname;
   
    //Add a custom constructor

    public Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    
    public String getSSN(){
        return ssn;
    }
}
