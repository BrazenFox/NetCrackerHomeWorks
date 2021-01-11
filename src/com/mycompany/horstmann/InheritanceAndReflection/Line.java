package com.mycompany.horstmann.InheritanceAndReflection;

import com.mycompany.horstmann.InheritanceAndReflection.Shape;

public class Line extends Shape {

    Point point2;
    Point center;

    public Line(Point from, Point to) {
        this.point = from;
        this.point2 = to;
    }

    @Override
    public Point getCenter() {
        center.x = (point2.x - point.x) / 2;
        center.y = (point2.y - point.y) / 2;
        return center;
    }
}
