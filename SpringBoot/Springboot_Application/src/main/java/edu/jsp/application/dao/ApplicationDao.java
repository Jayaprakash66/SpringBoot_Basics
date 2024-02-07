package edu.jsp.application.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import edu.jsp.application.dto.Application;
import edu.jsp.application.repository.ApplicationRepo;

@Repository
public class ApplicationDao {
	
	@Autowired
	private ApplicationRepo repo;
	
	public Application saveApplication(Application p) {
		return repo.save(p);
	}
}
