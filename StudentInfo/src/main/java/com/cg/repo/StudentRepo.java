package com.cg.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.model.Student;



public interface StudentRepo extends MongoRepository<Student, Integer> {

	
}
