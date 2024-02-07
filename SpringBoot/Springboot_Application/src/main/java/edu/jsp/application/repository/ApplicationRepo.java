package edu.jsp.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.jsp.application.dto.Application;


public interface ApplicationRepo extends JpaRepository<Application, Integer>{

}