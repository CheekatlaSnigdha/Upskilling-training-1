package com.cg.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.StudentInfo;
import com.cg.service.Service;

@RestController
@RequestMapping("/students")
public class Controller {
	    private final Service studentService;
	 
	    @Autowired
	    public Controller(Service studentService) {
	        this.studentService = studentService;
	    }
	 
	    @GetMapping
	    public ResponseEntity<List<StudentInfo>> getAllStudents() {
	        List<StudentInfo> students = studentService.getAllStudents();
	        return new ResponseEntity<>(students, HttpStatus.OK);
	    }
	 
	    @GetMapping("/{id}")
	    public ResponseEntity<StudentInfo> getStudentById(@PathVariable Long id) {
	        Optional<StudentInfo> student = studentService.getStudentById(id);
	        return student.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
	                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	    }
	 
	    @PostMapping
	    public ResponseEntity<StudentInfo> createStudent(@RequestBody StudentInfo student) {
	        StudentInfo createdStudent = studentService.createStudent(student);
	        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
	    }
	 
	    @PutMapping("/{id}")
	    public ResponseEntity<StudentInfo> updateStudent(@PathVariable Long id, @RequestBody StudentInfo updatedStudent) {
	        StudentInfo student = studentService.updateStudent(id, updatedStudent);
	        return student != null ? new ResponseEntity<>(student, HttpStatus.OK)
	                               : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	 
	    @DeleteMapping("/{id}")
	    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
	        boolean isDeleted = studentService.deleteStudent(id);
	        return isDeleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT)
	                         : new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	}
