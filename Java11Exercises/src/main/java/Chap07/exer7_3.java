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
public class exer7_3 {
    public static void main(String[] args) {
        int int1;
        
	//  Declare and initialize variables of type long, float, and char.
        long long1 = 10L;
        
        float float1 = 20.5F;
        
        char char1 = 5;
        
        // Print the long variable.

        System.out.println(long1);
        
	// Assign the long to the int and print the int variable.
        int1 = (int) long1; 
        System.out.println("Long to int: " + int1);
    }   
}
