package com.mycompany.homework1.part1.book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String name;
    Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames() {
        StringBuilder result = new StringBuilder();
        int numberOfAuthors = this.authors.length;
        for (int i = 0; i < numberOfAuthors; i++) {
            result.append(authors[i].getName()).append(i != numberOfAuthors - 1 ? "," : "");  ;
        }
        return result.toString();
    }
}
