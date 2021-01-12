package com.mycompany.horstmann.InheritanceAndReflection;

public class Main {

    public static void main(String[] args) {

        Point point = new Point(5, 6);
        LabeledPoint labeledPoint = new LabeledPoint("myPoint", 5, 6);

        System.out.println(point.toString());
        System.out.println(labeledPoint.toString());
        System.out.println(labeledPoint.getLabel());
        System.out.println(labeledPoint.x);


        Item item1 = new Item("Apple", 100000);
        Item item2 = new Item("Apple", 100000);
        System.out.println(item1.equals(item2));


        MixColor color = new MixColor();
        color.getRed();
        color.chooseColor();
        System.out.println(color.color);


    }

}
