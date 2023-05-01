package com.example.demo.repository;

import com.example.demo.entity.Guardian;
import com.example.demo.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder()
                .firstName("Bob")
                .lastName("Bobson")
                .emailId("bob@gmail.com")
                .build();

        studentRepository.save(student);
    }

    @Test
    public void saveStudentWithGuardian() {

        Guardian guardian = Guardian.builder()
                .name("Billy")
                .email("billy@gmail.com")
                .mobile("99999999")
                .build();

        Student student = Student.builder()
                .firstName("Bobby")
                .lastName("Boberson")
                .emailId("bobby@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);
    }

    @Test
    public void printALlStudents() {
        List<Student> studentlist = studentRepository.findAll();

        System.out.println("studentlist = " + studentlist);
    }

    @Test
    public void PrintStudentByFirstName() {
        List<Student> students = studentRepository.findByFirstName("Bob");

        System.out.println("students = " + students);
    }

    @Test
    public void PrintStudentByFirstNameContaining() {
        List<Student> students = studentRepository.findByFirstNameContaining("b");

        System.out.println("students = " + students);
    }

    @Test
    public void PrintStudentByGuardianName() {
        List<Student> students = studentRepository.findByGuardianName("Billy");

        System.out.println("students = " + students);
    }

    @Test
    public void PrintStudentByEmailAddress() {
        Student student = studentRepository.getStudentByEmailAddress("bobby@gmail.com");

        System.out.println("student = " + student);
    }

    @Test
    public void PrintStudentByEmailAddressNative() {
        Student student = studentRepository.getStudentByEmailAddressNative("bobby@gmail.com");

        System.out.println("student = " + student);
    }

    @Test
    public void PrintStudentByEmailAddressNativeNamedParam() {
        Student student = studentRepository.getStudentByEmailAddressNativeNamedParam("bobby@gmail.com");

        System.out.println("student = " + student);
    }

    @Test
    public void updateStudentByEmailId() {
        studentRepository.updateStudentNameByEmailId("Bobbington", "bobby@gmail.com");
    }

}