/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap10;

/**
 *
 * @author jaden
 */
public class Employees {
    
    public String name1 = new String("Fred Smith");
    public String name2 = new String("Sam Smith");
    
    public void areNamesEqual(){
        if (name1.equals(name2)){
            System.out.println("Same name.");
        }
        else{
            System.out.println("Different name.");
        }
    }
}
