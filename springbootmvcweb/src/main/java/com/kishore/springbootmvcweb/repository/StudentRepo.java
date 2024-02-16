package com.kishore.springbootmvcweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kishore.springbootmvcweb.entity.Student;

public interface StudentRepo extends JpaRepository<Student,Long>{

}
