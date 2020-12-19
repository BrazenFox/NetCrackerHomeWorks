package com.mycompany.homework1.part2.mycomplex;

import java.util.Objects;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imag + "i)";
    }

    public boolean isReal() {
        return real != 0.0;
    }

    public boolean isImaginary() {
        return imag != 0.0;
    }

    public boolean equals(double real, double imag) {
        return this.real == real && this.imag == imag;
    }

    public boolean equals(MyComplex another) {
        return equals(another.getReal(), another.getImag());
    }

    public double magnitude() {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2));
    }

    public double argument() {
        return Math.atan(real / imag);
    }

    public MyComplex add(MyComplex right) {
        this.real += right.real;
        this.imag += right.imag;
        return this;
    }

    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.getReal(), this.imag + right.getImag());
    }

    public MyComplex subtract(MyComplex right) {
        this.real -= right.real;
        this.imag -= right.imag;
        return this;
    }

    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.getReal(), this.imag - right.getImag());
    }

    public MyComplex multiply(MyComplex right) { //не понял, нужно здесь менять существующее число, или возвращать новое, поэтому вернул новое
        return new MyComplex(this.real * right.real - this.imag * right.imag, this.real * right.imag + this.imag * right.real);
    }

    public MyComplex divide(MyComplex right) { //не понял, нужно здесь менять существующее число, или возвращать новое, поэтому вернул новое
        MyComplex result = new MyComplex();
        result.setReal((this.real * right.real + this.imag * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2)));
        result.setImag((this.imag * right.real - this.real * right.imag) / (Math.pow(right.real, 2) + Math.pow(right.imag, 2)));
        return result;
    }

    public MyComplex conjugate() {
        return new MyComplex(this.real, -this.imag);
    }


}
