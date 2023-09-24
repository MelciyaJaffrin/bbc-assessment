package com.bbc.utilitybillingapplication.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbc.utilitybillingapplication.dao.CustomerDao;
import com.bbc.utilitybillingapplication.model.Customer;


@Service
public class CustomerService {
	
	@Autowired
	CustomerDao customerDao;
	
	public List<Customer> getAllCustomers(){
		return customerDao.getAllCustomers();
	}
	
    public String addCustomer(Customer customer) {
		
		return customerDao.addCustomer(customer);
	}

}
