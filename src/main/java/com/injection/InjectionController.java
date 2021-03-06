package com.injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InjectionController {

    @Autowired
    private School school;
    @RequestMapping("/teacher")
    String getTeacherName()
    {
        return school.showTeacher();
    }
}
