package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	// Controller returns 1 student's information:
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Nicholas", "Le");
	}
	
	// Controller returns list student's information:
	@GetMapping("/students")
	public List<Student> getStudents() {
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Nicholas", "Le"));
		student.add(new Student("NCL", "Le"));
		student.add(new Student("Tony", "Cena"));
		return student;
	}
	
	// Get data on the path: http://localhost:8080/student/firstName/lastName
	@GetMapping("/student/{firstName}/{lastName}")
	public Student studentPathVariable(@PathVariable("firstName") String firstName, 
					@PathVariable("lastName") String lastName) {
		return new Student(firstName, lastName);
	}
	
	// http://localhost:8080/student?firstName=Nicholas&lastName=Le
	@GetMapping("/student/query")
	public Student studentQueryParam(@RequestParam(name = "firstName") String firstName, 
					@RequestParam(name = "lastName") String lastName) {
		return new Student(firstName, lastName);
	}

}
