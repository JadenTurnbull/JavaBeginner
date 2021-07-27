/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap06;

/**
 *
 * @author jaden
 */
public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Pete", 22, "70 Cherry Street", 79, 46);
        Customer customer2 = new Customer("James", 20, "5 Blossom Street", 59, 61);
        Customer customer3 = new Customer("Mark", 17, "12 Tree Street", 21, 31);
        Customer customer4 = new Customer("Carl", 69, "51 Bolt Street", 54, 18);
        
        Customer[] Customers = {customer1, customer2, customer3, customer4};
        
        for (Customer theCustomer : Customers){
            System.out.println(theCustomer.name);
        }
        
     // Customer customer2 = customer1;
        
        /*
        customer1.name = "Pete";
        customer1.age = 21;
        customer1.address = "70 Cherry Street";
        customer1.custID = 1;
        customer1.orderNum = 68;
        */
        
//        customer1.setName("Peter Dinklage");
//        customer1.setAddress("70 Blossom Street");
//        customer1.setAge(45);
//        customer1.setCustID(12);
//        customer1.setOrderNum(56);
//        
//        System.out.println(customer1.getName());
//        System.out.println(customer1.getAge());
//        System.out.println(customer1.getAddress());
//        System.out.println(customer1.getCustID());
//        System.out.println(customer1.getOrderNum());
        
     // customer1.displayCustomer();
    }
    
    
}
