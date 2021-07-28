/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap10Ex3;

/**
 *
 * @author jaden
 */
public class Order {
    static final char CORP = 'C';
    static final char PRIVATE = 'P';
    static final char NONPROFIT = 'N';
    String name;
    double total;
    String stateCode;
    double discount;
    char custType;

    public Order(String name, double total, String state, char custType) {
        this.name = name;
        this.total = total;
        this.stateCode = state;
        this.custType = custType;
        calcDiscount();
    }
    
    public String getDiscount(){
        return Double.toString(discount) + "%";
    }

    public void calcDiscount() {
        // Replace the if logic with a switch statement.

          switch(custType){
              case 'N':
                  if(total >900){
                      discount = 10.00;
                  }else discount = 8.00;
                  break;
                  
              case 'P':
                  if(total > 900){
                      discount = 7.00;
                  }else discount = 0.00;
                  break;
                  
              case 'C':
                  if (total > 500){
                      discount = 8.00;
                  }else discount = 5.00;
                  break;
              default:
                  discount = 0.00;
          } 
    }
}
