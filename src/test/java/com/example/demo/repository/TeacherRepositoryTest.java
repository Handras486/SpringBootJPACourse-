package com.example.demo.repository;

import com.example.demo.entity.Course;
import com.example.demo.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeacherRepositoryTest {

    @Autowired
    private TeacherRepository teacherRepository;

    @Test
    public void SaveTeacher() {

        Course courseDBA = Course.builder()
                .title("DBA")
                .credit(5)
                .build();

        Course courseJava = Course.builder()
                .title("Java")
                .credit(6)
                .build();

        Teacher teacher = Teacher.builder()
                .firstName("Jack")
                .lastName("Jackson")
                //.courses(List.of(courseDBA,courseJava))
                .build();

        teacherRepository.save(teacher);
        System.out.println("teacher = " + teacher);
    }

}