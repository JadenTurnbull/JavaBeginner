/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap12;

/**
 *
 * @author jaden
 */
public class Main {
    public static void main(String[] args) {
        Shirt shirt1 = new Shirt(15, "Hawaiain", 'R', 55.9, 'M', "Short Sleeve");
        shirt1.display();
        System.out.println("\n");
        Trousers trouser = new Trousers(30, 94, 'M', 21, "Sweatpants", 'G', 100.69);
        trouser.display();
    }
}
