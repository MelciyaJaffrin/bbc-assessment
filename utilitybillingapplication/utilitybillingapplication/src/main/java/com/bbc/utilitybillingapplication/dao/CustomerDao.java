package com.bbc.utilitybillingapplication.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bbc.utilitybillingapplication.model.Customer;


@Repository
public class CustomerDao {
	
	@Autowired
	SessionFactory factory;
	
	public List<Customer> getAllCustomers(){
		
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Customer.class);
		return criteria.list();
	}
	
	public String addCustomer(Customer customer) {
		Session session = factory.openSession();
		session.save(customer);
		session.beginTransaction().commit();
		return "Customer created ";
	}
	

}
