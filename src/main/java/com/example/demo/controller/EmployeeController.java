package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.EmployeeRepository;
import com.example.demo.entity.Employee;
@RestController
@RequestMapping("/Employee")

public class EmployeeController {
	@Autowired
  EmployeeRepository employeeRepository;
	
//	@GetMapping("/Hello")
//	public String getMsg() {
//		return"hello people";
//	}
	
	@GetMapping ("/get-all-employees")
		public List<Employee>getEmployee(){
			return employeeRepository.findAll();
			
	}

	@GetMapping ("/get-employee-byId")
	public Employee getById(@RequestParam (value="id") Long id) {
		Optional<Employee>employee= employeeRepository.findById(id);
		return employee.get();
	}
@PostMapping ("/add-employee")	
public Employee saveEmployees(@RequestBody Employee employee) {
	return employeeRepository.save(employee);
	
	
}
@DeleteMapping ("/DeleteBYId")
public void DeleteEmp(@RequestParam (value="id") Long id) {
	employeeRepository.deleteById(id);
}
}
	
  
		


