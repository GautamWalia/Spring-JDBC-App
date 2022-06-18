package com.practice.sm.DAO;

import java.util.List;

import com.practice.sm.entity.Student;

public interface StudentDao 
{
	List<Student> loadStudents();
	
	void saveStudent(Student student);
	
	Student getStudent(int id);

	void deleteStudent(int id);

	void updateStudent(Student student);
}
