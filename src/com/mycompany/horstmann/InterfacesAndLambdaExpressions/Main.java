package com.mycompany.horstmann.InterfacesAndLambdaExpressions;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import static com.mycompany.horstmann.InterfacesAndLambdaExpressions.Task10.runInOrder;
import static com.mycompany.horstmann.InterfacesAndLambdaExpressions.Task10.runTogether;
import static com.mycompany.horstmann.InterfacesAndLambdaExpressions.Task8.luckySort;

public class Main {

    public static void main(String[] args) {
        ///////1,2
        Measurable[] measurables = {
                new Employee(1),
                new Employee(2),
                new Employee(3),
        };

        System.out.println(Measurable.average(measurables));

        Employee[] employees = {
                new Employee(1, "Dima"),
                new Employee(2, "Nastya"),
                new Employee(3, "Elena"),
        };

        System.out.println(Employee.getLargest(employees));
        ///////1,2

        ///////4,5
        int[] pi = {3, 1, 4, 1, 5, 9, 2, 6};
        IntSequence seq = IntSequence.of(pi);
        System.out.println(seq.hasNext());
        System.out.println(seq.next());

        IntSequence constant = IntSequence.constant(1);
        for (int i = 0; i < 10; i++) {
            System.out.println(constant.next());
        }
        ///////4,5

        ///////8
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("abc");
        strings.add("ab");
        strings.add("abcd");

        luckySort(strings, (s1, s2) -> s1.length() - s2.length());

        System.out.println(strings);
        ///////8

        ///////9
        Greeter message1 = new Greeter("message1", 3);
        Greeter message2 = new Greeter("message2", 2);

        Thread threadMessage1 = new Thread(message1);
        Thread threadMessage2 = new Thread(message2);

        threadMessage1.start();
        threadMessage2.start();
        ///////9

        ///////10
        Runnable runnable1 = () -> System.out.println("runnable1");
        Runnable runnable2 = () -> System.out.println("runnable2");

        runTogether(runnable1, runnable2);
        runInOrder(runnable1, runnable2);
        ///////10


        ///////11
        Task11 task11 = new Task11();
        System.out.println(Arrays.toString(task11.ls(".")));
        System.out.println(Arrays.toString(task11.lsMethodExpression(".")));
        System.out.println(Arrays.toString(task11.lsAnonymousClass(".")));
        ///////11

        ///////12
        Task12 task12 = new Task12();
        System.out.println(Arrays.toString(task12.lsFilesOfExtension(".", "iml")));
        ///////12

        ///////13
        Task13 task13 = new Task13();
        File[] files = new File(".").listFiles();
        Task13.sort(files);
        System.out.println(Arrays.toString(files));
        ///////13


    }

}
