package com.sms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sms.entity.Student;
import com.sms.service.StudentService;

@Controller
public class StudentControlller {
	private StudentService studentService;
	public StudentControlller(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String getAllStudent(Model model)
	{
		model.addAttribute("student",studentService.getallStudent());
		return "students";
	}
	
	@GetMapping("/student/new")
	public String addStudent(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		return "Add-Student";
	}
	
	@PostMapping("/student")
	public String addStudent(@ModelAttribute("student") Student student)
	{
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping("/student/delete/{id}")
	public String deleteStudent(@PathVariable("id")int id)
	{	
		studentService.deleteStudentData(id);
		return "redirect:/students";
	}
	
	@GetMapping("/student/update/{id}")
	public String editStudent(@PathVariable("id")int id,Model model)
	{
		Student student=studentService.getStudentById(id);
		System.out.println("edit:"+student.getId());
		model.addAttribute("student",student);
		return "edit-student";
	}
	
	@PostMapping("/student/update/save")
	public String updateStudent(@ModelAttribute Student student)
	{
		Student stu=studentService.saveStudent(student);
		System.out.println("update:"+stu.getId());
		return "redirect:/students";
	}

}
