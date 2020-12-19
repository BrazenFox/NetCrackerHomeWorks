package com.mycompany.homework1.part2.mypolynomial;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double[] coeffs) {
        this.coeffs = coeffs;
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = (this.coeffs.length - 1); i >= 0; i--) {
            result.append(this.coeffs[i]).append(i != 0 ? "*x^" + i + "+" : "");
        }
        return result.toString();
    }

    public double evaluate(double x) {
        int result = 0;
        for (int i = 0; i < (this.coeffs.length); i++) {
            result += this.coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    public MyPolynomial add(MyPolynomial right) {
        int degree = Math.min(this.coeffs.length, right.coeffs.length);
        double[] newCoeffs = new double[degree];

        for (int i = 0; i < degree; i++) {
            newCoeffs[i] = this.coeffs[i] + right.coeffs[i];
        }
        return new MyPolynomial(newCoeffs);
    }


    public MyPolynomial multiply(MyPolynomial right) {
        double[] newCoeffs = new double[this.coeffs.length + right.coeffs.length - 1];
        for (int i = 0; i < this.coeffs.length; i++) {
            for (int j = 0; j < right.coeffs.length; j++) {
                newCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }
        return new MyPolynomial(newCoeffs);
    }


}
