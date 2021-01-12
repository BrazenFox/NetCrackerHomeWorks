package com.mycompany.horstmann.InheritanceAndReflection;


public class Line extends Shape {

    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        Point from = getPoint();
        return new Point(to.getX() - from.getX(), to.getY() - from.getY());
    }

    @Override
    public Line clone() throws CloneNotSupportedException {
        Line cloned = (Line) super.clone();
        cloned.to = new Point(to.getX(), to.getY());

        return cloned;
    }

    public Point getTo() {
        return to;
    }

    public void setTo(Point to) {
        this.to = to;
    }
}
