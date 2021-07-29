/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap11Ex3;

/**
 *
 * @author jaden
 */
public class ShoppingCart {
    Item[] items = {new Item("Shirt",25.60), 
                    new Item("WristBand",1.00), 
                    new Item("Pants",35.99)};
    
    public static void main(String[] args){   
        ShoppingCart cart = new ShoppingCart();
        cart.displayTotal();
    }
    
    public void displayTotal(){
        double total = 0;
        for(int i = 0; i < items.length; i++){
            if(items[i].isBackOrdered()) 
		continue;
            total += items[i].getPrice();
        }
        System.out.println("Shopping Cart total: "+total);
    }
}
