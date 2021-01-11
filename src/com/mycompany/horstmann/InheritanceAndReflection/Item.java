package com.mycompany.horstmann.InheritanceAndReflection;

import java.util.Objects;

public class Item {

    private String description;
    private double price;

    public Item(String description, double price){
        this.description = description;
        this.price = price;
    }

    @Override
    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof Item)) {
            return false;
        }

        Item otherItem = (Item) other;

        return price == otherItem.price && description.equals(otherItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description);
    }

}
