/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author jaden
 */
public class Lists {
    public static void main(String[] args) {
        String[] names = {"Ned", "Fred", "Jones", "Olivia", "Georgia"};
    List<String> myList = new ArrayList (Arrays.asList(names));
    
//    for(String s: mylist){
//            System.out.println(s.toUpperCase()+", ");
//            
//    }
    myList.replaceAll(s -> s.toUpperCase());
    
    myList.removeIf (s -> s.equals("Olivia"));
    myList.removeIf (s -> s.length() < 5);
        System.out.println("List.replaceAll lambda: "+ myList);
    }
    
}
