package com.example.demo1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
//@RestController goes to studentController
public class Demo1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

//	@GetMapping
//	public List<String> hello(){
//		return List.of("Hello", "World");
//	}

	/**
	 * all goes to controller
	 */
//	@GetMapping
//	public List<Student> getStudents(){
//		return List.of(
//				new Student(
//						1L,
//						"Charlie",
//						"charlie.yang@gmail.com",
//						LocalDate.of(2000, Month.FEBRUARY, 11),
//						23
//				)
//		);
//	}

}
