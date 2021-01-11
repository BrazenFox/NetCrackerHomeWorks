package com.mycompany.horstmann.FundamentalProgrammingStructures;

import java.util.ArrayList;
import java.util.Collections;

public class Task13 {
    ArrayList<Integer> arrayList1 = new ArrayList<>();
    ArrayList<Integer> arrayList2 = new ArrayList<>();


    public void completeArr() {
        for (int i = 0; i < 49; i++) {
            arrayList1.add(i, i + 1);
        }
        for (int i = 0; i < 6; i++) {
            double j1 = Math.random() * (arrayList1.size() - 1) + 1;
            int j = (int) j1;
            arrayList2.add(i,arrayList1.get(j));
            arrayList1.remove(j);;
        }

        Collections.sort(arrayList2);

        for (Integer i: arrayList2) {
            System.out.print(i + " ");
        }

    }
}
