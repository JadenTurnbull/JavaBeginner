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
public class Customer {
    public String name;
    public int custID;
    public String address;
    public int orderNum;
    public int age;
    
    public void displayCustomer(){
        System.out.println("Customer: "+ name);
        System.out.println("Customer ID: "+ custID);
        System.out.println("Customer address: "+ address);
        System.out.println("Customer order number: "+ orderNum);
        System.out.println("Customer age: "+ age);   
    }
    
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getCustID() {
//        return custID;
//    }
//
//    public void setCustID(int custID) {
//        this.custID = custID;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getOrderNum() {
//        return orderNum;
//    }
//
//    public void setOrderNum(int orderNum) {
//        this.orderNum = orderNum;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public Customer(String name, int custID, String address, int orderNum, int age) {
        this.name = name;
        this.custID = custID;
        this.address = address;
        this.orderNum = orderNum;
        this.age = age;
    }
    
    
}
