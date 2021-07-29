/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chap12;

/**
 *
 * @author jaden
 */
public class Trousers extends Clothing{
    private int Length;
    private int waistSize;
    private char gender;

    public Trousers(int Length, int waistSize, char gender, int itemID, String desc, char colorCode, double price) {
        super(itemID, desc, colorCode, price);
        this.Length = Length;
        this.waistSize = waistSize;
        this.gender = gender;
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("Length: " + getLength());
        System.out.println("Waist size: " + getWaistSize());
        System.out.println("Gender: " + getGender());
    }

    public int getLength() {
        return Length;
    }

    public void setLength(int Length) {
        this.Length = Length;
    }

    public int getWaistSize() {
        return waistSize;
    }

    public void setWaistSize(int waistSize) {
        this.waistSize = waistSize;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
}
