package com.mycompany.horstmann.FundamentalProgrammingStructures;

import java.math.BigInteger;

public class Task6 {
    private int n;

    public Task6(int n) {
        this.n = n;
    }

    public void factorial() {
        BigInteger result = BigInteger.valueOf(1);
        BigInteger j = BigInteger.valueOf(1);
        for (int i = 0; i < n; i++) {
            result = result.multiply(j);
            j = j.add(BigInteger.valueOf(1));
        }
        System.out.println(result);
    }

}
