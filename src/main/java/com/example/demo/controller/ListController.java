package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;

@RestController
public class ListController {
	
	//http://localhost:8080/studentlists
	@GetMapping("/studentlists")
	
	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Yeshwanth", "Kumar"));
		students.add(new Student("Vishal", "Raj"));
		students.add(new Student("Gokul", "R"));
		students.add(new Student("Raj", "Kumar"));
		students.add(new Student("Vishal", "Yeshwanth"));
		students.add(new Student("Gokul", "Yeshwanth"));
		return students;
		
	}

}
