package com.mycompany.horstmann.ObjectOrientedProgramming;

public class Car {
    private int x = 0;
    private double fuelEffiency;
    private double fuelLevel;

    public Car(double fuelEffiency) {
        this.fuelEffiency = fuelEffiency;
    }

    public void Move (double distance) {
        if (fuelLevel >= distance / fuelEffiency) {
            x += distance;
            fuelLevel -= distance / fuelEffiency;
        } else {
            System.out.println("The fuel level is too low to drive this distance");
        }
    }

    public void addFuel(int quantityOfFuel) {
        this.fuelLevel += quantityOfFuel;
    }

    public double maxDistance() {
        return fuelLevel * fuelEffiency;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getCurrentDistance() {
        return this.x;
    }

    @Override
    public String toString() {
        return "Car{" +
                "current distance from the origin =" + x +
                ", fuelEffiency=" + fuelEffiency +
                ", fuelLevel=" + fuelLevel +
                ", maxDistance =" + maxDistance() +
                '}';
    }
}
