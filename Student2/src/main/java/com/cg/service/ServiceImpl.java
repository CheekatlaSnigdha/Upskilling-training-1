package com.cg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.model.StudentInfo;
import com.cg.repository.StuRepo;

public class ServiceImpl implements Service {
	private final StuRepo studentRepository;
	 
    @Autowired
    public ServiceImpl(StuRepo studentRepository) {
        this.studentRepository = studentRepository;
    }
 
    public List<StudentInfo> getAllStudents() {
        return studentRepository.findAll();
    }
 
    public Optional<StudentInfo> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
 
    public StudentInfo createStudent(StudentInfo student) {
        return studentRepository.save(student);
    }
 
    public StudentInfo updateStudent(Long id, StudentInfo updatedStudent) {
        Optional<StudentInfo> existingStudentOptional = studentRepository.findById(id);
        if (existingStudentOptional.isPresent()) {
            updatedStudent.setId(id);
            return studentRepository.save(updatedStudent);
        }
        return null; // Or handle this as per your application's needs
    }
 
    public boolean deleteStudent(Long id) {
        Optional<StudentInfo> studentOptional = studentRepository.findById(id);
        if (studentOptional.isPresent()) {
            studentRepository.deleteById(id);
            return true;
        }
        return false; // Or handle this as per your application's needs
	    }
	}
