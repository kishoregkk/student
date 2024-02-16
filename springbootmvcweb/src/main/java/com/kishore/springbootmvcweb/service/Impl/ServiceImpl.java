package com.kishore.springbootmvcweb.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kishore.springbootmvcweb.entity.Student;
import com.kishore.springbootmvcweb.repository.StudentRepo;
import com.kishore.springbootmvcweb.service.StudentService;

@Service
public class ServiceImpl implements StudentService {

	@Autowired
	StudentRepo sr;
	
	@Override
	public List<Student> getAllStudents() {
		return  sr.findAll();
	}

	@Override
	public Student saveStdent(Student student) {
		return sr.save(student);
		
	}

	@Override
	public Student  gettingstobjextbyId(Long id) {
		 
		return sr.findById(id).get();
	}

	@Override
	public Student updateStudent(Student stu) {
		return sr.save(stu);
	}

	@Override
	public void deletethestudent(Long id) {
		Student s=sr.findById(id).get();
		sr.delete(s);
		
	}

	
	

}
