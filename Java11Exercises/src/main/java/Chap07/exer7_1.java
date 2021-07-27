/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap07;

/**
 *
 * @author jaden
 */
public class exer7_1 {
    public static void main (String[] args){
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        
        // Get the index of the space character (" ") in custName. 
        int index = custName.indexOf(' ');
        System.out.println("Index of space: "+ index);

        // Use the substring method parse out the first name and print it.
        firstName = custName.substring(0, 5);
        System.out.println("First name is "+ firstName);

    }
}
