package com.mycompany;

import com.mycompany.homework1.part1.book.Author;
import com.mycompany.homework1.part1.book.Book;
import com.mycompany.homework1.part1.circle.Circle;
import com.mycompany.homework1.part1.employee.Employee;
import com.mycompany.homework1.part1.mypoint.MyPoint;
import com.mycompany.homework1.part1.mytriangle.MyTriangle;
import com.mycompany.homework1.part1.rectangle.Rectangle;
import com.mycompany.homework1.part2.ball.Ball;
import com.mycompany.homework1.part2.ball.Container;
import com.mycompany.homework1.part2.mycomplex.MyComplex;
import com.mycompany.homework1.part2.mypolynomial.MyPolynomial;

public class Main {
    public static void main(String[] args) {
        // part1
        Author author1 = new Author("AAA", "mail1", 'f');
        Author author2 = new Author("BBB", "mail2", 'm');
        Author author3 = new Author("CCC", "mail3", 'f');
        Author[] auu = {author1, author2, author3};

        Book book1 = new Book("Book", auu, 1000, 300);
        System.out.println(book1.getAuthorNames());

        Employee employee = new Employee(1, "Art", "Art", 1000);
        Rectangle rectangle = new Rectangle(20, 20);
        Circle circle = new Circle(5, "blue");
        MyPoint myPoint1 = new MyPoint(4, 3);
        MyPoint myPoint2 = new MyPoint(3, 4);
        MyPoint myPoint3 = new MyPoint(0, 0);
        MyTriangle myTriangle = new MyTriangle(0, 0, 7, 5, 4, 10);
        System.out.println(myTriangle.toString());


        // part2
        MyComplex myComplex1 = new MyComplex(-10, -4);
        MyComplex myComplex2 = new MyComplex(8, 1);
        myComplex1.multiply(myComplex2);
        MyComplex myComplex3 = myComplex1.subtractNew(myComplex2);
        System.out.println(myComplex1.toString());

        Ball ball1 = new Ball((float) 0.5, (float) 8, 1, 10, 0);
        System.out.println(ball1.toString());
        Container box = new Container(0, 0, 20, 10);
        System.out.println("Is Ball in the container?: " + box.collides(ball1));
        ball1.move();
        System.out.println(ball1.toString());
        System.out.println("Is Ball in the container?: " + box.collides(ball1));
        ball1.setxDelta(5);
        ball1.move();
        System.out.println(ball1.toString());
        System.out.println("Is Ball in the container?: " + box.collides(ball1));
        ball1.setyDelta(3);
        ball1.move();
        System.out.println(ball1.toString());
        System.out.println("Is Ball in the container?: " + box.collides(ball1));
        ball1.reflectHorizontal();
        ball1.reflectVertical();
        ball1.move();
        System.out.println(ball1.toString());
        System.out.println("Is Ball in the container?: " + box.collides(ball1));


        double[] ex1 = {3, 2, 1};
        MyPolynomial myPolynomial1 = new MyPolynomial(ex1);
        MyPolynomial myPolynomial2 = new MyPolynomial(ex1);
        MyPolynomial myPolynomial3 = myPolynomial1.multiply(myPolynomial2);

        System.out.println(myPolynomial1.evaluate(0));
        System.out.println(myPolynomial3.toString());
        System.out.println(myPolynomial1.evaluate(-1));

    }
}
