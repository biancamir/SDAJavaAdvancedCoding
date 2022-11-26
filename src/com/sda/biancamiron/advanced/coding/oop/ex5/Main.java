package com.sda.biancamiron.advanced.coding.oop.ex5;

/**
 * Create an abstract Shape class with the abstract methods calculatePerimeter() for calculating the perimeter
 * and calculateArea() for calculating the area.
 * Create Rectangle, Triangle, Hexagon classes, extending the Shape class, and implementing abstract methods accordingly.
 * Verify the solution correctness.
 */

public class Main {

    public static void main(String[] args) {
        Shape3D qube = new Qube(100);

        System.out.println("Area is " +qube.calculateArea());
        System.out.println("Perimeter is " +qube.calculatePerimeter());
        System.out.println("Volume is " +qube.calculateVolume());

        qube.fill(200);
        qube.fill(2000000000);
    }
}
