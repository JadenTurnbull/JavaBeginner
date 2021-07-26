/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap05;

/**
 *
 * @author jaden
 */
public class ShoppingCart {
    public static void main(String[] args) {
        String[] custName = {"Mary Smith", "Trystan Dames", "Jaden Turnbell"};
        String itemDesc = "Shirt";
        String message;

       double price = 21.99;
       int quantity = 2;
       double total;
       message = custName[2]+" wants to purchase "+ quantity + " " + itemDesc;

       total = (price*quantity);

       boolean outOfStock = false;

       if (quantity > 1) {
            message = message +"s";
       }

       if (outOfStock){
           System.out.println(itemDesc + " is out of stock");
       }
       else{
           System.out.println(message);
           System.out.println("Total cost with tax: "+total);
       }
    }
}
