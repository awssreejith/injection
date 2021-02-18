package com.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
    @Autowired
    private Teacher teacher;

    public String showTeacher()
    {
        return teacher.getName();
    }
}
