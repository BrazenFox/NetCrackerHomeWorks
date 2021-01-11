package com.mycompany.horstmann.FundamentalProgrammingStructures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task8 {
    private String str;

    public Task8(String str) {
        this.str = str;
    }

    public void substr() {
        String[] array = str.split(" +");
        for (String word: array) {
            System.out.println(word);
            }
        }
    }

