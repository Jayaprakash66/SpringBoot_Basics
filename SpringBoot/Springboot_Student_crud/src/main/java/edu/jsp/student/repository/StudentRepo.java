package edu.jsp.student.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.jsp.student.dto.Student;


public interface StudentRepo extends JpaRepository<Student, Integer> {

  public Optional<Student> findByName(String name);
}