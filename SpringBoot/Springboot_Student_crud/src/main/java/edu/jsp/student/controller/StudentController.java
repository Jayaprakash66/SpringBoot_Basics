package edu.jsp.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.student.dto.Student;
import edu.jsp.student.service.StudentService;
import edu.jsp.student.util.ResponseStructure;

@RestController
public class StudentController {

  @Autowired
  private StudentService service;
  
  @PostMapping("savestudentcrud")
  public ResponseStructure<Student> saveStudent(@RequestBody Student p) {
    return service.saveStudent(p);
  }
  
  @GetMapping("getstudentcrud")
  public ResponseStructure<Student> fetchStudentById(@RequestParam int id) {
    return service.fetchStudentById(id);
  }
  
  @GetMapping("getallstudentcrud")
  public ResponseStructure<List<Student>> fetchAll() {
    return  service.fetchAll();
  }
  
  @DeleteMapping("deletecrud/{id}")
  public ResponseStructure<String> delById(@PathVariable int id) {
    return service.deleteById(id);
    
  }
  
  @DeleteMapping("deletecrud")
  public ResponseStructure<String> deleteById1(@RequestParam int id) {
    return service.deleteById(id);
    
  }
  
  @GetMapping("fetchbynamecrud")
  public ResponseStructure<Student> fetchbyName(@RequestParam String name) {
    return service.fetchbyName(name);
  }
  @PutMapping("updatestudentcrud")
  public ResponseStructure<Student> updateProduct( int id, @RequestBody Student p) {
    return service.updateStudent(id, p);
  }
}
