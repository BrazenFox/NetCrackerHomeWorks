package com.mycompany.horstmann.InterfacesAndLambdaExpressions;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import static com.mycompany.horstmann.InterfacesAndLambdaExpressions.Task10.runInOrder;
import static com.mycompany.horstmann.InterfacesAndLambdaExpressions.Task10.runTogether;
import static com.mycompany.horstmann.InterfacesAndLambdaExpressions.Task8.luckySort;

public class Main {

    public static void main(String[] args) {
        ///////1
        System.out.println("Task 1:");
        Measurable[] measurables = {
                new Employee(100),
                new Employee(200),
                new Employee(300),
        };

        System.out.println(Measurable.average(measurables));
        ///////1

        ///////2
        System.out.println("Task 2:");
        Employee[] employees = {
                new Employee(100, "Dima"),
                new Employee(200, "Nastya"),
                new Employee(300, "Elena"),
        };

        System.out.println(Employee.getLargest(employees));
        ///////2

        ///////4
        System.out.println("Task 4:");
        int[] pi = {3, 1, 4, 1, 5, 9, 2, 6};
        IntSequence sequence = IntSequence.of(pi);
        while(sequence.hasNext()){
            System.out.println(sequence.next());
        }
        ///////4


        ///////5
        System.out.println("Task 5:");
        IntSequence constant = IntSequence.constant(1);
        for (int i = 0; i < 10; i++) {
            System.out.println(constant.next());
        }
        ///////5

        ///////8
        System.out.println("Task 8:");
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("abc");
        strings.add("ab");
        strings.add("abcd");

        Task8.luckySort(strings, (s1, s2) -> s1.length() - s2.length());

        System.out.println(strings);
        ///////8

        ///////9
        System.out.println("Task 9:");
        Thread threadMessage1 = new Thread(new Greeter("message1", 3));
        Thread threadMessage2 = new Thread(new Greeter("message2", 2));

        threadMessage1.start();
        threadMessage2.start();
        ///////9

        ///////10
        System.out.println("Task 10:");
        Runnable runnable1 = () -> System.out.println("runnable1");
        Runnable runnable2 = () -> System.out.println("runnable2");

        Task10.runTogether(runnable1, runnable2);
        Task10.runInOrder(runnable1, runnable2);
        ///////10


        ///////11
        System.out.println("Task 11:");
        Task11 task11 = new Task11();
        System.out.println(Arrays.toString(task11.ls(".")));
        System.out.println(Arrays.toString(task11.lsMethodExpression(".")));
        System.out.println(Arrays.toString(task11.lsAnonymousClass(".")));
        ///////11

        ///////12
        System.out.println("Task 12:");
        Task12 task12 = new Task12();
        System.out.println(Arrays.toString(task12.lsFilesOfExtension(".", "iml")));
        ///////12

        ///////13
        System.out.println("Task 13:");
        Task13 task13 = new Task13();
        File[] files = new File(".").listFiles();
        Task13.sort(files);
        System.out.println(Arrays.toString(files));
        ///////13


    }

}
