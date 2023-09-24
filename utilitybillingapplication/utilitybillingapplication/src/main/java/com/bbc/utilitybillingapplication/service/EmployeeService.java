package com.bbc.utilitybillingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbc.utilitybillingapplication.dao.EmployeeDao;
import com.bbc.utilitybillingapplication.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployees(){
		return employeeDao.getAllEmployees();
	}

	public String addEmployee(Employee employee) {
		
		return employeeDao.addEmployee(employee);
	}

}
