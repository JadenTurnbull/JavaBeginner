/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap09;

/**
 *
 * @author jaden
 */
public class Order {
    public static void main(String[] args) {
        
        Item item = new Item(10.00);
     // item.price = 10.00;
     // item.setPrice(10.00);
        System.out.println("Price : "+item.getPrice());
       
    }
}
