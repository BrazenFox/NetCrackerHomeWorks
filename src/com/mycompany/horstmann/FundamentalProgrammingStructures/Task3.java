package com.mycompany.horstmann.FundamentalProgrammingStructures;

public class Task3 {
    private int a, b, c;

    public Task3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void findMax() {
        int max;

        System.out.println("Find max value among 3 values:");
        System.out.print("Using If: ");

        if (a >= b) {
            max = a;
            if (max >= c) {
                System.out.println(max);
            } else {
                System.out.println(c);
            }
        } else {
            max = b;
            if (max >= c) {
                System.out.println(max);
            } else {
                System.out.println(c);
            }
        }

        System.out.print("Using Math.max: ");

        if (Math.max(a, b) > Math.max(a, c)) {
            System.out.println(Math.max(b, c));
        } else if (Math.max(a, b) == Math.max(a, c)) {
            System.out.println(Math.max(a,b));
        } else {
            System.out.println(Math.max(b, c));
        }
    }
}
