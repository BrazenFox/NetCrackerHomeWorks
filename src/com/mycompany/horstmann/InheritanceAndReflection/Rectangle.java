package com.mycompany.horstmann.InheritanceAndReflection;

import com.mycompany.horstmann.InheritanceAndReflection.Point;

public class Rectangle extends Shape{

    Point center;
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        this.point = topLeft;
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        double dx = this.width / 2;
        double dy = this.height / 2;
        center.x = point.x + dx;
        center.y = point.y + dy;
        return center;
    }
}
