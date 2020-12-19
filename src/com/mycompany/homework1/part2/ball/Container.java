package com.mycompany.homework1.part2.ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    public int getX() {
        return x1;
    }

    public int getY() {
        return y1;
    }

    public int getWidth() {
        return (x2 - x1);
    }

    public int getHeight() {
        return (y2 - y1);
    }

    public boolean collides(Ball ball) {
        boolean check = true;
        if (((ball.getX() - ball.getRadius()) < this.x1) || ((ball.getX() + ball.getRadius()) > this.x2)
                || ((ball.getY() - ball.getRadius()) < this.y1) || ((ball.getY() + ball.getRadius()) < this.x1)) {
            check = false;
        }

        return check;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}