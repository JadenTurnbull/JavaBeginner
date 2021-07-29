/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap11;

/**
 *
 * @author jaden
 */
public class twodArrays {
    public static void main(String[] args) {
        int year = 2020;
        
        int[][] Sales = new int [4][4];
        Sales[0][0] = 10;
        Sales[1][0] = 50;
        Sales[2][0] = 30;
        Sales[3][0] = 45;
        Sales[0][1] = 123;
        Sales[1][1] = 57;
        Sales[2][1] = 1004;
        Sales[3][1] = 5220;
        Sales[0][2] = 2204;
        Sales[1][2] = 69;
        Sales[2][2] = 2002;
        Sales[3][2] = 7896;
        Sales[0][3] = 278;
        Sales[1][3] = 45;
        Sales[2][3] = 63;
        Sales[3][3] = 99;
        
        for(var i = 0; i < Sales.length; i++){
            System.out.println(year + " :");
            year = ++year;
            for(var j = 0; j < Sales[i].length; j++){
                System.out.println("\tQ"+(j+i)+":"+Sales[i][j]);
            }
            System.out.println("\n");
        } 
    }  
}
