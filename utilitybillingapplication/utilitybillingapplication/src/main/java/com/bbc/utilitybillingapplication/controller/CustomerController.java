package com.bbc.utilitybillingapplication.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbc.utilitybillingapplication.model.Customer;
import com.bbc.utilitybillingapplication.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@GetMapping("getAllCustomers")
	public List<Customer> getAllCustomers(){
		return customerService.getAllCustomers();
		
	}

	@PostMapping ("addCustomers")
	
	public String addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	
	

}
