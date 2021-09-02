package com.company;

public class Main {

    public static void main(String[] args) {
	    // byte
        // short
        // int
        // long
        // float
        // double
        // char
        //boolean

        String myString = "This is String";
        System.out.println("myString is = " + myString);

        myString = myString + ", this is more";
        System.out.println("myString is = " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("myString is = " + myString);

        String numString = "250.55";
        numString = numString + "49.95";
        System.out.println(numString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNum = 120.47d;
        lastString = lastString + doubleNum;
        System.out.println("LastString is equal to " + lastString);

    }
}
