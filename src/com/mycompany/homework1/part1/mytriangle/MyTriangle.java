package com.mycompany.homework1.part1.mytriangle;

import com.mycompany.homework1.part1.mypoint.MyPoint;

public class MyTriangle {
    private MyPoint point1;
    private MyPoint point2;
    private MyPoint point3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.point1 = new MyPoint(x1, y1);
        this.point2 = new MyPoint(x2, y2);
        this.point3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint point1, MyPoint point2, MyPoint point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    @Override
    public String toString() {
        return "MyTriangle[" +
                "point1=" + point1.toString() +
                ", point2=" + point2.toString() +
                ", point3=" + point3.toString() +
                ')';
    }

    public String getType() {
        double a = point1.distance(point2);
        double b = point1.distance(point3);
        double c = point2.distance(point3);

        String result = "This triangle is a ";

        if (a == b + c || b == a + c || c == a + b) {
            return result + TypeTriangle.NONTRIANGLE.getType();
        } else if (a == b && b == c) {
            return result + TypeTriangle.EQUILATERIAL.getType();
        } else if (a == b || b == c || a == c) {
            return result + TypeTriangle.ISOSCELES.getType();
        } else {
            return result + TypeTriangle.SCALENE.getType();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyTriangle)) { return false;}

        MyTriangle that = (MyTriangle) o;


        return this.point1.equals(that.point1) && this.point2.equals(that.point2) && this.point3.equals(that.point3);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + point1.hashCode();
        result = 31 * result + point2.hashCode();
        result = 31 * result + point3.hashCode();
        return result;
    }

}
