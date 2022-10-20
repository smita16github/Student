package com.spring.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.restapi.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{
	public Student findByName(String name);


}
