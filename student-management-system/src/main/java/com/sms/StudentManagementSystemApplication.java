package com.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sms.entity.Student;
import com.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		/*Student stu1=new Student("vicky","sahu","vicky@gmail.com");
		Student stu2=new Student("rahul","yadav","rahul@gmail.com");
		Student stu3=new Student("pushpak","raut","pushpak@gmail.com");
		studentRepository.save(stu1);
		studentRepository.save(stu2);
		studentRepository.save(stu3);*/
	}

}
