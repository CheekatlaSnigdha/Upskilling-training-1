package com.cg.model;

import org.springframework.data.annotation.Id;

public class StudentInfo {
		
		@Id
		private long id;
		private String name;
		private int age;
		private int salary;
		public StudentInfo() {
			super();
		}
		public StudentInfo(String name, int age, int salary) {
			super();
			this.name = name;
			this.age = age;
			this.salary = salary;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getSalary() {
			return salary;
		}
		
		public void setSalary(int salary) {
			this.salary = salary;
			
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + ", salary=" + salary + "]";
		}
		
		
	}
