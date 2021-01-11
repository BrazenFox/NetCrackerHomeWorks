package com.mycompany.horstmann.InterfacesAndLambdaExpressions;

interface Measurable {
    double getMeasure();

    static double average(Measurable[] measurables) {
        double sum = 0;
        for (Measurable measurable : measurables) {
            sum += measurable.getMeasure();
        }
        return sum / measurables.length;
    }

    static Measurable largest(Measurable[] measurables) {
        Measurable largest = measurables[0];

        for (Measurable measurable : measurables) {
            if (measurable.getMeasure() > largest.getMeasure()) {
                largest = measurable;
            }
        }

        return largest;
    }
}
