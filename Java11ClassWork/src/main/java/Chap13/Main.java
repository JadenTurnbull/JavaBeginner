/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap13;

import Chap12.*;

/**
 *
 * @author jaden
 */
public class Main{

    public static void main(String[] args) {
        System.out.println("Shirt: ");
        Shirt shirt1 = new Shirt(15, "Hawaiain", 'R', 55.9, 'M', "Short Sleeve");
        shirt1.display();
        System.out.println(shirt1.doReturn());

        System.out.println("\n");

        System.out.println("Trousers: ");
        Trousers trouser = new Trousers(30, 94, 'M', 21, "Sweatpants", 'G', 100.69);
        trouser.display();

        System.out.println("\n");

        Clothing Jean = new Trousers(24, 55, 'F', 69, "Jeans", 'B', 400.21);

        if (Jean instanceof Trousers) {
            int JeanLength = ((Trousers) Jean).getLength();
            System.out.println("Jean Length: " + JeanLength + "\n");
        } else {
            System.out.println("Item is not a Trouser");
        }

        Jean.display();
        
        System.out.println("\n");

        System.out.println(shirt1.toString());

    }
}
