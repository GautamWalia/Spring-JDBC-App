package com.practice.sm.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.practice.sm.entity.Student;
import com.practice.sm.rowmapper.StudentRowMapper;

@Repository
public class StudentDaoImpl implements StudentDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Student> loadStudents() {
		//List<Student> studentList =  new ArrayList<>();
		
		String sql= "SELECT * FROM students;";
		List<Student> listOfStudents = jdbcTemplate.query(sql, new StudentRowMapper());
		return listOfStudents;
	}

	@Override
	public void saveStudent(Student student) {
		
		Object[] sqlParameters = {student.getName(), student.getMobile(), student.getCountry()};
		
		String sql= "insert into students(name, mobile, country) values (?,?,?);";
		jdbcTemplate.update(sql, sqlParameters);
		
		System.out.println("new student record has been saved");
	}

	@Override
	public Student getStudent(int id) {
		String sql= "SELECT * FROM students WHERE id= ?";
		Student student= jdbcTemplate.queryForObject(sql, new StudentRowMapper(), id);
		return student;
	}

	@Override
	public void deleteStudent(int id) {
		String sql= "DELETE FROM students WHERE id= ?";
		jdbcTemplate.update(sql, id);
		System.out.println("student with id:" + id +" has been deleted");
	}

	@Override
	public void updateStudent(Student student) {
		String sql= "UPDATE students SET name= ?, mobile= ?, country= ? WHERE id= ?";
		
		jdbcTemplate.update(sql, student.getName(), student.getMobile(), 
								student.getCountry(), student.getId());
		System.out.println("1 record has been updated");
	}

}
