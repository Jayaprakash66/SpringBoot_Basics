package edu.jsp.Student.Student_app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.jsp.Student.Student_app.dto.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
