package edu.jsp.student.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.student.dto.Student;
import edu.jsp.student.repository.StudentRepo;


@Repository
public class StudentDao {

  @Autowired
  private StudentRepo repo;
  
  public Student saveStudent(Student p) {
    return repo.save(p);
  }

  public Student fetchStudentById(int id) {
    Optional<Student> o = repo.findById(id);
    return o.get();
  }
  //fetchall records
  public List<Student> fetchAll(){
    return repo.findAll();
  }
  //delete
  public String deleteById(int id) {
    repo.deleteById(id);
    return "Deleted Sucessfully!";
  }
  //fetchByName
  public Student fetchbyName(String name) {
    Optional<Student> o= repo.findByName(name);
    return o.get();
  }
  //update
  public Student updateStudent(Student p) {
    return repo.save(p);
  }
}

