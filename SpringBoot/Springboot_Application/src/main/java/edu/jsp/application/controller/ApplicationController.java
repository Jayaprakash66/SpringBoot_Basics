package edu.jsp.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.jsp.application.dto.Application;
import edu.jsp.application.service.ApplicationService;

@RestController
public class ApplicationController {
	@Autowired
	private ApplicationService service;
	@PostMapping("saveapplication")
	public Application saveApplication(@RequestBody Application p) {
		return service.saveApplication(p);
	}
}
