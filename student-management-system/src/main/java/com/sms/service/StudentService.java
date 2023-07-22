package com.sms.service;

import java.util.List;

import com.sms.entity.Student;

public interface StudentService {
	public List<Student> getallStudent();
	public Student saveStudent(Student student);
	public void deleteStudentData(int id);
	public Student getStudentById(int id);

}
