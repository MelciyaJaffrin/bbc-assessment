package com.bbc.utilitybillingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbc.utilitybillingapplication.model.Employee;
import com.bbc.utilitybillingapplication.service.EmployeeService;

@CrossOrigin()
@RestController
@RequestMapping("employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("getallemployees")
	public List<Employee> getAllEmployees(){
		
		return employeeService.getAllEmployees();
	}
	
	@PostMapping("addemployee")
	public String addEmployee(@RequestBody Employee employee) {
		return employeeService.addEmployee(employee);
		
	}

}
