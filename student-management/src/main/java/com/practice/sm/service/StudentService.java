package com.practice.sm.service;

import java.util.List;

import com.practice.sm.entity.Student;

public interface StudentService {

	public List<Student> loadStudents();

	public void saveStudent(Student student);
	
	public Student getStudent(int id);

	public void deleteStudent(int id);

	 void updateStudent(Student student);
}
