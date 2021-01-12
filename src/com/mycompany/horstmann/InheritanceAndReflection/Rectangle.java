package com.mycompany.horstmann.InheritanceAndReflection;

import com.mycompany.horstmann.InheritanceAndReflection.Point;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        Point topLeft = getPoint();
        return new Point(topLeft.getX() + (width / 2), topLeft.getY() + (height / 2));
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        return (Rectangle) super.clone();
    }
}
