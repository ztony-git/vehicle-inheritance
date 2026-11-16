package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void openTruck() {
        System.out.println("Trunk opened");
    }

    public void closeTruck() {
        System.out.println("Trunk closed");
    }
}
