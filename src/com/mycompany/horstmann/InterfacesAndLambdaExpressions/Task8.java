package com.mycompany.horstmann.InterfacesAndLambdaExpressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Task8 {


    static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
        while (!isSorted(strings, comp)) {
            Collections.shuffle(strings);
        }
    }

    static boolean isSorted (ArrayList<String> strings, Comparator<String> comp) {
        for (int i = 0; i < strings.size() - 1; i++) {
            if (comp.compare(strings.get(i), strings.get(i + 1)) > 0) {
                return false;
            }
        }

        return true;
    }
}
