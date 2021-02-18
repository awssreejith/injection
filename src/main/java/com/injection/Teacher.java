package com.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

//A non maintained class
public class Teacher {

   @Autowired
   private Student student;

    public String getName() {
       return name + "|"+student.getName();
    }
    public Teacher()
    {
        System.out.println("Teacher constructor called");
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

}
