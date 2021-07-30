/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap13;

import Chap12.*;

/**
 *
 * @author jaden
 */
public class Sock extends Material{
    private double price;
    private String materialType1 = "Cotton";
    private String materialType2 = "Wool";
    private String materialType3 = "Silk";
    
    public double getPrice(){
        return price;
    }
    
    public String getMaterialType1(){
        return materialType1;
    }

    public String getMaterialType2() {
        return materialType2;
    }

    public String getMaterialType3() {
        return materialType3;
    }
    
    
}
