package com.microservicios2.clase4.restapi.service;

import java.util.Optional;

import com.microservicios2.clase4.restapi.model.Student;

public interface StudentService {

	public Iterable<Student> findAll();

	public Student save(Student student);

	public Optional<Student> findByID(String id);

	public void removeStudent(String id);

}