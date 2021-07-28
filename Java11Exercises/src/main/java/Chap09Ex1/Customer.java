/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09Ex1;

/**
 *
 * @author jaden
 */
public class Customer {
    public String name;
    public String ssn;
   
    // Encapsulate this class.  Make ssn read only.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }
    
}


