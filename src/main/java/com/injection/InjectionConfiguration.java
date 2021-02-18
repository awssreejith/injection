package com.injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InjectionConfiguration {

    @Bean
    public Teacher getTeacherBean()
    {
        Teacher teacher = new Teacher();
        teacher.setName("Some Teacher");
        return teacher;
    }


    @Bean
    public Book getBookBean()
    {
        Book book = new Book();
        book.setName("Some Book");
        return book;
    }

    @Bean
    public Student getStudentBean()
    {
        Student student = new Student();
        student.setName("Some Student");
        return student;
    }


}
