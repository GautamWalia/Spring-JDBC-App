package com.practice.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.practice.sm.entity.Student;
import com.practice.sm.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/showStudent")
	public String showStudentList(Model model) {
		List<Student> studentList = studentService.loadStudents();

		model.addAttribute("students", studentList);
		return "student-list";
	}

	@GetMapping("/showAddStudentPage")
	public String addStudent(Model model) {
		Student studentDTO = new Student();

		model.addAttribute("student", studentDTO);
		return "add-student";
	}

	@PostMapping("/saved-student")
	public String saveStudent(Student student) {
		System.out.println(student);
		if (student.getId() == 0) {
			studentService.saveStudent(student);
		} else {
			studentService.updateStudent(student);
		}
		return "redirect:/showStudent";
	}

	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam("userId") int id, Model model) {
		System.out.println("looking for user with id: " + id);

		Student theStudent = studentService.getStudent(id);
		model.addAttribute("student", theStudent);
		System.out.println(theStudent);

		return "add-student";
	}

	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("userId") int id) {

		studentService.deleteStudent(id);
		return "redirect:/showStudent";
	}

}
