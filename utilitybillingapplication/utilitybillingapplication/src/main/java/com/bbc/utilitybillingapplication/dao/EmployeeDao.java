package com.bbc.utilitybillingapplication.dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bbc.utilitybillingapplication.model.Customer;
import com.bbc.utilitybillingapplication.model.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	SessionFactory factory;

	public List<Employee> getAllEmployees() {
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		return criteria.list();
		
	}

	public String addEmployee(Employee employee) {
		Session session = factory.openSession();
		session.save(employee);
		session.beginTransaction().commit();
		return "Employee account created";
	}
	
	
	
}
