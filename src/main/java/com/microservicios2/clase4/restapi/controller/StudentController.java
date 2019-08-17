package com.microservicios2.clase4.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservicios2.clase4.restapi.model.Student;
import com.microservicios2.clase4.restapi.service.StudentService;


@RestController
@RequestMapping(value = "/api/")
public class StudentController {

	@Autowired
	StudentService studentserviceV1;


	@RequestMapping(value = "/v1/students", method = RequestMethod.GET)
	public Iterable<Student> studentV1() {
		return studentserviceV1.findAll();
	}
	
	@RequestMapping(value = "/v1/students", method = RequestMethod.POST)
	 public Student create(@RequestBody Student student) {
		return studentserviceV1.save(student);
	 }

	
}

