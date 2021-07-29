/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap11;
import java.util.ArrayList;
/**
 *
 * @author jaden
 */
public class ArrayL {
    public static void main(String[] args) {
        ArrayList<String> names;
        names = new ArrayList();
        
        names.add("Peter");
        names.add(1,"Jones");
        
        System.out.println(names);
    }
}
