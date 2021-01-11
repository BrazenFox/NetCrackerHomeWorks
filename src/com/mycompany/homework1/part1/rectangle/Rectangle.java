package com.mycompany.homework1.part1.rectangle;

public class Rectangle {
    private float height = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
    }

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) { return false;}

        Rectangle rectangle = (Rectangle) o;

        return (this.width==rectangle.width)&&(this.height==this.height);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int)this.height;
        result = 31 * result + (int)this.width;
        return result;
    }


}
