package edu.jsp.Student.Student_app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.Student.Student_app.dao.StudentDao;
import edu.jsp.Student.Student_app.dto.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;
	
	public Student saveStudent(Student s) {
		
		return studentDao.saveStudent(s);
	}
}
