package com.cg.service;

import java.util.List;
import java.util.Optional;

import com.cg.model.StudentInfo;

public interface Service {

	public List<StudentInfo> getAllStudents();
	public Optional<StudentInfo> getStudentById(Long id);
	public StudentInfo createStudent(StudentInfo student);
	public StudentInfo updateStudent(Long id, StudentInfo updatedStudent);
	public boolean deleteStudent(Long id);
}
