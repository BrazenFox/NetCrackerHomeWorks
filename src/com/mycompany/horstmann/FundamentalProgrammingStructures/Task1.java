package com.mycompany.horstmann.FundamentalProgrammingStructures;

public class Task1 {
    private int number;

    public Task1(int number) {
        this.number = number;
    }

    public void convert() {
        System.out.println("Binary: " + Integer.toBinaryString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Reciprocal: " + Float.toHexString((float) 1/number));
    }
}
