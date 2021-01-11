package com.mycompany.horstmann.FundamentalProgrammingStructures;

import org.w3c.dom.ls.LSOutput;

public class Task7 {
    private double a, b;
    private int c, d;

    public void count() {
        a = Math.random() * 4294967295L + 1;
        c = (int) a;
        b = Math.random() * 4294967295L + 1;
        d = (int) b;
        System.out.println("a = " + c);
        System.out.println("b = " + d);
        System.out.println("sum = " + (c + d));
        System.out.println("difference = " + (c - d));
        System.out.println("product = " + (c * d));
        System.out.println("quotient = " + (c / d));
        System.out.println("remainder = " + (c % d));
    }


}
