package com.mycompany.homework1.part1.book;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name +
                ", email='" + email +
                ", gender='" + gender +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) { return false;}

        Author author = (Author) o;

        return (this.gender==author.gender)&&(author.email.equals(this.email))&&(author.name.equals(this.name));
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result +this.name.hashCode();
        result = 31 * result + this.email.hashCode();
        result = 31 * result + (int)gender;
        return result;
    }
}
