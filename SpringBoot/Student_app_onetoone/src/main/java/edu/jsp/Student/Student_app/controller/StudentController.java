package edu.jsp.Student.Student_app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.Student.Student_app.dto.Student;
import edu.jsp.Student.Student_app.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@PostMapping("savestudentone2one")
	public Student saveStudent(@RequestBody Student s) {
		return studentservice.saveStudent(s);
	}

}
