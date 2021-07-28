/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap10Ex1;

/**
 *
 * @author jaden
 */
public class TestClass {
    public static void main(String args[]) {
        int x = 4, y = 9;
//        if (y / x < 3) {
//            x += y;
//        } else {
//            x *= y;
//        }
//        System.out.println("After if stmt, x = " + x);
        
         // Use a ternary operator to perform the same logic as above.
         int s = ( ((y / x) < 3) ? (x += y) : (x *= y));
         
         System.out.println("After if stmt, x = " + x);
    }
}
