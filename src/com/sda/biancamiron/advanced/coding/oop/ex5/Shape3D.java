package com.sda.biancamiron.advanced.coding.oop.ex5;

/**
 * Create an abstract 3DShape class that extends the Shape class from the previous task. Add an additional method calculateVolume().
 */

public abstract class Shape3D extends Shape implements Fillable {
    public abstract double calculateVolume();

    @Override
    public void fill(double water) {
        double volume = calculateVolume();
        if(volume>water){
            System.out.println("Not pouring enough water ");
        }else if (volume==water){
            System.out.println("Fill the figure with water to the brim ");
        }else{
            System.out.println("Will pour too much water into the figure and overflow ");
        }
    }
}
