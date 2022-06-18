package com.practice.sm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.sm.DAO.StudentDao;
import com.practice.sm.entity.Student;

@Component
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	@Override
	public List<Student> loadStudents() {
		
		List<Student> listOfStudents= studentDao.loadStudents();
		
		return listOfStudents;
	}
	@Override
	public void saveStudent(Student student) {
		
		if(student.getCountry().equals("CA")) {
			System.out.println("Welcome: " + student.getName() );
		}
		studentDao.saveStudent(student);
	}
	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(id) ;
	}
	@Override
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
	}
	@Override
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}

}
