package com.mycompany.horstmann.InheritanceAndReflection;

import com.mycompany.homework1.part1.mypoint.MyPoint;

import java.util.Objects;

public class Point {

    protected double x;
    protected double y;


    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }



    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) { return false;}

        Point point = (Point) o;

        return (this.y == point.y)&&(this.x ==point.x);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = (int) (31 * result + this.x);
        result = (int) (31 * result + this.y);
        return result;
    }
}
