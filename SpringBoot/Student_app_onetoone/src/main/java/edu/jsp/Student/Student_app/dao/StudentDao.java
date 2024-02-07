package edu.jsp.Student.Student_app.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.Student.Student_app.dto.Student;
import edu.jsp.Student.Student_app.repository.StudentRepo;

@Repository
public class StudentDao {
	
	@Autowired
	private StudentRepo studentRepo;
	
	public Student saveStudent(Student e) {
		return studentRepo.save(e);
		
	}

}
