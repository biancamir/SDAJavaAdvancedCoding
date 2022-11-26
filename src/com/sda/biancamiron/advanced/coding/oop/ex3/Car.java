package com.sda.biancamiron.advanced.coding.oop.ex3;

import java.util.List;
import java.util.Objects;

/**
 * Create a Car class that will contain fields: name, model, price, year of manufacture,
 *  * manufacturer list (Manufacturer), and engine type (represented as the enum class, e.g. V12, V8, V6, S6, S4, S3).
 *  * Include all necessary methods and constructor parameters. Implement the hashcode() and equals() methods
 */

public class Car {
    private String name;
    private String model;
    private double price;
    private int yearOfManufacturer;
    private List<Manufacturer> manufacturers;
    private EngineType engineType;

    public Car(String name, String model, double price, int yearOfManufacturer, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacturer = yearOfManufacturer;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYearOfManufacturer() {
        return yearOfManufacturer;
    }

    public void setYearOfManufacturer(int yearOfManufacturer) {
        this.yearOfManufacturer = yearOfManufacturer;
    }

    public List<Manufacturer> getManufacturers() {
        return manufacturers;
    }

    public void setManufacturers(List<Manufacturer> manufacturers) {
        this.manufacturers = manufacturers;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", yearOfManufacturer=" + yearOfManufacturer +
//                ", manufacturers=" + manufacturers +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && yearOfManufacturer == car.yearOfManufacturer && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturers, car.manufacturers) && engineType == car.engineType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, yearOfManufacturer, manufacturers, engineType);
    }
}
