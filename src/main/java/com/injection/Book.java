package com.injection;

//A non maintained class
public class Book {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book() {
        System.out.println("Book constructor called");
    }

    String name;
}
