/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap12Ex3;

/**
 *
 * @author jaden
 */
public class Main {
    public static void main(String[] args) {
         // declare and instantiate a Shirt object using an Item reference type
        Item item = new Shirt(25.99, 'M', 'G');
        // call the display method on the object, then the getColor method
        item.display();
        if (item instanceof Shirt) {
            String color = ((Shirt) item).getColor();
            System.out.println("Color: " + color);
        }else System.out.println("Item is not a Shirt.");
    }
}
