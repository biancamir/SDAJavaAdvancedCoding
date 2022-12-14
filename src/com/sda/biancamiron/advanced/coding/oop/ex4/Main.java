package com.sda.biancamiron.advanced.coding.oop.ex4;

/**
 * Create a Car enum class with FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA etc. constants.
 * Each vehicle has its own parameters, e.g. price, power, etc.
 * Enum should contain boolean isPremium() and boolean isRegular() methods.
 * The isPremium() method should return the opposite result to the call of the isRegular() method.
 *  In addition, the boolean isFasterThan() method should be declared and implemented as part of the enum class.
 *  This method should accept the Car type object and display information
 *  that the indicated vehicle is faster or not than the vehicle provided in the argument.
 *  To do this, use the compareTo() method.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Price for Ferrari is " +Car.FERRARI.getPrice());
        System.out.println("Power for Ferrari is " +Car.FERRARI.getPower());
        System.out.println("Ferrari is Regular? " +Car.FERRARI.isRegular());
        System.out.println("Ferrari is Premium? " +Car.FERRARI.isPremium());
        System.out.println("Ferrari is Faster than BMW? " +Car.FERRARI.isFasterThan(Car.BMW));

    }
}
