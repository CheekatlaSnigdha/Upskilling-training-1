package com.cg.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg.model.StudentInfo;

public interface StuRepo extends MongoRepository<StudentInfo, Long> {

}
