package com.mycompany.horstmann.ObjectOrientedProgramming;

import com.mycompany.horstmann.ObjectOrientedProgramming.Car;

public class Main {

    public static void main(String[] args) {
//        Point point = new Point(3,4).translate(1,3).scale(0.5);
//        System.out.println(point.toString());

        Car car = new Car(10);
        car.addFuel(25);
        car.Move(2000);
        System.out.println(car.toString());

    }

}
