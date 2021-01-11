package com.mycompany.horstmann.InterfacesAndLambdaExpressions;


public interface IntSequence {
    default boolean hasNext() {
        return true;
    }

    static IntSequence of (int[] numbers) {
        return new IntSequence() {
            private int counter = 0;

            public boolean hasNext() {
                return counter < numbers.length;
            }

            public int next() {
                counter++;
                return numbers[counter - 1];
            }
        };
    }

    int next();

    public static double average(IntSequence sequence, int n) {
        int count = 0;
        double sum = 0;
        while (sequence.hasNext() && count < n) {
            count++;
            sum += sequence.next();
        }
        return count == 0 ? 0 : sum / count;
    }


    public static IntSequence constant(int value) {
        return () -> value;
    }

}

