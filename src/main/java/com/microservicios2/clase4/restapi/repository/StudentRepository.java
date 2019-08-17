package com.microservicios2.clase4.restapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservicios2.clase4.restapi.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {


}