package com.sda.biancamiron.advanced.coding.oop.ex4;

/**
 * Create a Car enum class with FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA etc. constants.
 * * Each vehicle has its own parameters, e.g. price, power, etc.
 * * Enum should contain boolean isPremium() and boolean isRegular() methods.
 * * The isPremium() method should return the opposite result to the call of the isRegular() method.
 * *  In addition, the boolean isFasterThan() method should be declared and implemented as part of the enum class.
 * *  This method should accept the Car type object and display information
 * *  that the indicated vehicle is faster or not than the vehicle provided in the argument.
 * *  To do this, use the compareTo() method.
 */

//constructorul de la enum e mereu "privat"

public enum Car {
    FERRARI(2000, 20, false),
    PORSCHE(3000, 150, false),
    MERCEDES(1500, 185, false),
    BMW(2750, 312, true),
    OPEL(1727, 95, true),
    FIAT(1250, 116, true),
    TOYOTA(2340, 13, true);
    private final double price;
    private final double power;
    private final boolean isRegular;

    Car(double price, double power, boolean isRelugar) {
        this.price = price;
        this.power = power;
        this.isRegular = isRelugar;
    }

    public double getPrice() {
        return price;
    }

    public double getPower() {
        return power;
    }

    public boolean isRegular() {
        return isRegular;
    }

    public boolean isPremium() {
        return !isRegular;
    }
    public boolean isFasterThan(Car otherCar){
        int result =  Double.compare(this.power, otherCar.power);
        return result >= 0;
    }

}
