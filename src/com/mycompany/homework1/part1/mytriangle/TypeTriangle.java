package com.mycompany.homework1.part1.mytriangle;

public enum TypeTriangle {
    EQUILATERIAL ("equilateral"),
    ISOSCELES ("isosceles"),
    SCALENE ("scalene"),
    NONTRIANGLE("non triangle");

    private String type;

    TypeTriangle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
