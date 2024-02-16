package com.kishore.springbootmvcweb.service;

import java.util.List;
import java.util.Optional;

import com.kishore.springbootmvcweb.entity.Student;

public interface StudentService{
	
	List<Student> getAllStudents();
	
	Student saveStdent(Student student);
	
	Student gettingstobjextbyId(Long id);
	
	Student updateStudent(Student stu);
	
	void deletethestudent(Long id);

}
