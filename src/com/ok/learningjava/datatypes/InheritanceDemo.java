package com.ok.learningjava.datatypes;

// Parent (base) class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
    void stop() {
        System.out.println("Vehicle has stopped.");
    }
}
// Single inheritance: Vehicle -> Car
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is being driven.");
    }
}
// Multilevel inheritance: Vehicle -> Car -> ElectricCar
class ElectricCar extends Car {
    void charge() {
        System.out.println("Electric car is charging.");
    }
}
// Hierarchical inheritance: Vehicle -> Car and Vehicle -> Bike
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike is being ridden.");
    }
}
class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance ---");
        Car car = new Car();
        car.start();        // inherited from Vehicle
        car.drive();
        System.out.println("\n--- Multilevel Inheritance ---");
        ElectricCar ecar = new ElectricCar();
        ecar.start();       // from Vehicle
        ecar.drive();       // from Car
        ecar.charge();      // own method
        System.out.println("\n--- Hierarchical Inheritance ---");
        Bike bike = new Bike();
        bike.start();       // Bike also inherits from Vehicle
        bike.ride();
        bike.stop();
    }
}