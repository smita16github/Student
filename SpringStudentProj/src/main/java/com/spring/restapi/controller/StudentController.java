package com.spring.restapi.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.restapi.entity.Student;
import com.spring.restapi.service.ServiceImpl;

@RestController
@RequestMapping("/stud")
public class StudentController {
	private final ServiceImpl service;

	public StudentController(ServiceImpl service) {
		this.service = service;
	}

	@GetMapping("/get")
	public List<Student> getAllEmployees() {
		return service.getAllStudent();
	}

	@PostMapping("/save")
	public String saveEmployee(@RequestBody Student emp) {
		service.saveStudent(emp);
		return "Employee with ID " + emp.getId() + " is saved successfully";
	}

	@DeleteMapping("/delete")
	public String deleteStudent(@RequestParam(value = "studId") Integer id) {
		service.deleteStudent(id);
		return "Deleted employee associated with ID " + id;
	}

	@GetMapping("/DownloadCSV")
	public void generateCSVForAllEmployees(HttpServletResponse response) {
		service.generateCSV(response);
	}


}
