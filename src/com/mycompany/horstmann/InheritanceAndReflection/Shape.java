package com.mycompany.horstmann.InheritanceAndReflection;

public abstract class Shape {

    Point point = new Point(3,4);

    private double dx;
    private double dy;

    public Shape() {
    }

    public void moveBy(double dx, double dy) {
        point.x += dx;
        point.y += dy;
    }

    public abstract Point getCenter();

}
