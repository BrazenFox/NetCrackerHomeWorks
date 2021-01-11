package com.mycompany.horstmann.InterfacesAndLambdaExpressions;

import java.io.File;
import java.util.Arrays;

public class Task13 {
    public static void sort(File[] files) {
        Arrays.sort(files, (a, b) -> {
            if (a.isDirectory() && !b.isDirectory()) {
                return -1;
            }

            if (!a.isDirectory() && b.isDirectory()) {
                return 1;
            }

            return a.compareTo(b);
        });
    }
}
