package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.model.Student;

public class Testing {
	
	@Test
	void testStudentDetails() {
	        Student student = new Student();
	        student.setName("Snigdha");
	        student.setAge(22);
	        student.setSalary(1800);
	 
	        assertEquals("Snigdha", student.getName());
	        assertEquals(22, student.getAge());
	        assertEquals(1800, student.getSalary(), 0.001);
	    }
	}
