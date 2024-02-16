// srping boot mvc project using spring boot web,sql driver,jpa,thymeleaf;



package com.kishore.springbootmvcweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kishore.springbootmvcweb.entity.Student;
import com.kishore.springbootmvcweb.repository.StudentRepo;

@SpringBootApplication
public class SpringbootmvcwebApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootmvcwebApplication.class, args);
	}

	@Autowired
	StudentRepo sr;
	
	
	@Override
	public void run(String... args) throws Exception {
		
		
		
	Student s1=new Student("kishore","karunakaran","kisho801@gmail.com");
	sr.save(s1);
		
	}
	

}
