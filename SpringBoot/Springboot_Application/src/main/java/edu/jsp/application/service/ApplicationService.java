package edu.jsp.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.jsp.application.dao.ApplicationDao;
import edu.jsp.application.dto.Application;
import edu.jsp.application.repository.ApplicationRepo;
@Service
public class ApplicationService {
	
	@Autowired
	private ApplicationDao dao;
	
	public Application saveApplication(Application p) {
		return dao.saveApplication(p);
	}

}
