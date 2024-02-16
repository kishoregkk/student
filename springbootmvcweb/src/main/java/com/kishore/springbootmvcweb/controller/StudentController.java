package com.kishore.springbootmvcweb.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kishore.springbootmvcweb.entity.Student;
import com.kishore.springbootmvcweb.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService ss;
	
	@GetMapping("/students")
	public String listtheallstudents(Model m)
	{
		m.addAttribute("students",ss.getAllStudents());
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createnewstudent(Model m)
	{
		Student s=new Student();
		m.addAttribute("student",s);
		return "create_student";		
	}
	
	@PostMapping("/students")
	public String Savestdent(@ModelAttribute("student") Student stude)
	{
		ss.saveStdent(stude);
		return "redirect:/students";
		
	}
	
	@GetMapping("/students/edit/{id}")
	public String enterforedit(@PathVariable Long id,Model m)
	{
		m.addAttribute("student",ss.gettingstobjextbyId(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@ModelAttribute("student") Student s,@PathVariable Long id,Model m)
	{
		Student existingst=ss.gettingstobjextbyId(id);
		existingst.setFirstName(s.getFirstName());
		existingst.setLastName(s.getLastName());
		existingst.setEmail(s.getEmail());
		
		ss.updateStudent(existingst);
		return "redirect:/students";	
	}
	
	@GetMapping("/students/{id}")
	public String deletetheeeestudent(@PathVariable Long id)
	{
		ss.deletethestudent(id);
		return "redirect:/students";	
	}

			

}
