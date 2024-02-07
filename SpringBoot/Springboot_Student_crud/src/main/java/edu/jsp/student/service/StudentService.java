package edu.jsp.student.service;

import java.util.List;
import edu.jsp.student.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import edu.jsp.student.dao.StudentDao;
import edu.jsp.student.dto.Student;
import edu.jsp.student.util.ResponseStructure;

@Service
public class StudentService {

  @Autowired
  private StudentDao dao;
  
  public ResponseStructure<Student> saveStudent(Student p) {
//    return dao.saveProduct(p);
	  ResponseStructure<Student> rs=new ResponseStructure<>();
	  rs.setStatus(HttpStatus.CREATED.value());
	  rs.setMessage("Saved Successfully");
	  rs.setData(dao.saveStudent(p));
	  
	  return rs;
	  
  }
  public ResponseStructure<Student> fetchStudentById(int id) {
	  ResponseStructure<Student> rs= new ResponseStructure<>();
	  rs.setStatus(HttpStatus.OK.value());
	  rs.setMessage("data recievede successfully");
	  rs.setData(dao.fetchStudentById(id));
    return rs;
  }
  
  public ResponseStructure<List<Student>> fetchAll(){
    
	  ResponseStructure<List<Student>> rs=new ResponseStructure<>();
	  rs.setStatus(HttpStatus.OK.value());
	  rs.setMessage("All the data recieved");
	  rs.setData(dao.fetchAll());
	  return rs;
  }
  
  public ResponseStructure<String> deleteById(int id) {
	  ResponseStructure<String> rs=new ResponseStructure<>();
	  rs.setStatus(HttpStatus.OK.value());
	  rs.setMessage("data deleted");
	  rs.setData(dao.deleteById(id));
    return rs;
    
  }
  public ResponseStructure<Student> fetchbyName(String name) {
	  ResponseStructure<Student> rs=new ResponseStructure<>();
	  rs.setStatus(HttpStatus.OK.value());
	  rs.setMessage("Data recieved");
	  rs.setData(dao.fetchbyName(name));
    return rs;
  }
  
  public ResponseStructure<Student> updateStudent(int id, Student p) {
    
     Student p1=dao.fetchStudentById(id);
     
     if (p1!=null) {
      p.setId(id);
      ResponseStructure<Student> rs=new ResponseStructure<>();
      rs.setStatus(HttpStatus.CREATED.value());
	  rs.setMessage("Data updated");
	  rs.setData(dao.updateStudent(p));
      return rs;
    }
     return null;
  }
}