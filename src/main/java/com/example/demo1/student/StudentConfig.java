package com.example.demo1.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.DECEMBER;
import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Charlie = new Student(
                    "Charlie",
                    "charlie.yang@gmail.com",
                    LocalDate.of(2000, FEBRUARY, 11)

            );

            Student Nicole = new Student(
                    "Nicole",
                    "Nicole.huang@gmail.com",
                    LocalDate.of(1989, DECEMBER, 15)
            );
            repository.saveAll(
                    List.of(Charlie, Nicole)
            );
        };
    }
}
