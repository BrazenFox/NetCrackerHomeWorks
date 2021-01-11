package com.mycompany.horstmann.InterfacesAndLambdaExpressions;


class Employee implements Measurable {
    private double salary;
    private String name;

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(double salary, String name) {
        this(salary);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return this.salary;
    }

    public static String getLargest(Employee[] employees) {
        Measurable largest = Measurable.largest(employees);
        Employee largestEmployee = (Employee) largest;

        return largestEmployee.getName();
    }
}
