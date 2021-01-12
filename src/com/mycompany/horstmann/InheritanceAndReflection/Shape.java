package com.mycompany.horstmann.InheritanceAndReflection;

public abstract class Shape {

    Point point = new Point(3,4);

    private double dx;
    private double dy;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.x += dx;
        point.y += dy;
    }

    public abstract Point getCenter();

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Shape cloned = (Shape) super.clone();
        cloned.point = new Point(point.getX(), point.getY());

        return cloned;
    }

}
