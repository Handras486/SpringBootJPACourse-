package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(Student_oldRepository studentRepository){
//        return args -> {
//            Student_old maria = new Student_old( "Maria", "Jones", "maria@gmail.com", 25);
//            student_oldRepository.save(maria);
//        };
//    }
}
