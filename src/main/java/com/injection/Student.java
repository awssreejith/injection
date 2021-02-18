package com.injection;

import org.springframework.beans.factory.annotation.Autowired;

//A non maintained class
public class Student {

    @Autowired
    private Book book;

    public String getName() {
        return name +"|"+book.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student()
    {
        System.out.println("Student constructor called");
    }

    String name;
}
