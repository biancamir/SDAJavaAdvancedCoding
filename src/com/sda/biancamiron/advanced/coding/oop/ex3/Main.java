package com.sda.biancamiron.advanced.coding.oop.ex3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarService carService = new CarService();

        Manufacturer manufacturer1 = new Manufacturer("Audi", 1998, "Romania");
        Manufacturer manufacturer2 = new Manufacturer("Audi", 1970, "Germania");
        Manufacturer manufacturer3 = new Manufacturer("Audi", 1978, "Franta");
        Manufacturer manufacturer4 = new Manufacturer("Dodge", 1921, "US");
        Manufacturer manufacturer5 = new Manufacturer("Dodge", 1979, "Franta");

        Car car1 = new Car(
                "A4",
                "Break",
                2000,
                1998,
                List.of(manufacturer1, manufacturer2, manufacturer3),
                EngineType.V12
        );

        carService.addCar(car1);
        Car car2 = new Car(
                "Viper",
                "Sport",
                35000,
                2013,
                List.of(manufacturer4, manufacturer5),
                EngineType.V6
        );
        carService.addCar(car2);

        Car car3 = new Car(
                "Challenger",
                "Sport",
                40000,
                2017,
                List.of(manufacturer4, manufacturer5),
                EngineType.V6
        );
        carService.addCar(car3);


        System.out.println("All cars in service ");
        System.out.println(carService.getAllCars());
        System.out.println("All cars with V12 engine in service ");
        System.out.println(carService.getAllCarsWithV12EngineWithStream());
        System.out.println("Get all cars produced before 1999");
        System.out.println(carService.getAllCarsManufacturedBefore1999());
        System.out.println("Most expensive car ");
        System.out.println(carService.getMostExpensiveCarWithStream());
        System.out.println("Most cheapest car ");
        System.out.println(carService.getMostCheapestCarWithStream());
        System.out.println("Car with at least three manufactures ");
        System.out.println(carService.getCarWithAtLeast3Manufactures());
        System.out.println("All cars sorted ascending by price ");
        System.out.println(carService.getAllCarsSortedByPrice(true));
        System.out.println("All cars sorted descending by price ");
        System.out.println(carService.getAllCarsSortedByPrice(false));

        Car car4 = new Car(
                "A4",
                "Break",
                2000,
                1998,
                List.of(manufacturer1, manufacturer2, manufacturer3),
                EngineType.V12
        );

        System.out.println("Check if the car is in the service ");
        System.out.println(carService.containsCar(car4));

        Manufacturer manufacturer6 = new Manufacturer("Audi", 1998, "Romania");

        System.out.println("All cars by manufacturer ");
        System.out.println(carService.getCarsByManufacturer(manufacturer6));

        System.out.println("All cars by manufacturer with year of establishment > ");
        System.out.println(carService.getCarsWhichContainsManufactureWithEstablishmentYear(">", 1999));
        System.out.println(carService.getCarsWhichContainsManufactureWithEstablishmentYear("abc", 1999));

    }
}
