package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped moped = new Moped();
        moped.setColor("Red");
        moped.setFuelCapacity(90);
        moped.ride();
        System.out.println(moped);

        Car car = new Car();
        car.setColor("Black");
        car.setNumberOfPassengers(4);
        car.setNumberOfDoors(4);
        car.closeTruck();
        System.out.println(car);

        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setColor("Green");
        semiTruck.setCargoCapacity(200);
        semiTruck.loadCargo();
        System.out.println(semiTruck);

        Hovercraft hovercraft = new Hovercraft();
        hovercraft.setColor("White");
        hovercraft.setTopSpeed(80);
        hovercraft.hover();
        System.out.println(hovercraft);
    }
}
