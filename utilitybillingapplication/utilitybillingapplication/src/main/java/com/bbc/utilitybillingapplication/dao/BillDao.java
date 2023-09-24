package com.bbc.utilitybillingapplication.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bbc.utilitybillingapplication.model.Bill;
import com.bbc.utilitybillingapplication.model.Customer;

@Repository
public class BillDao {
	
	@Autowired
	SessionFactory factory;
	
	public String insertBill(Bill bill) {
		Session session = factory.openSession();
		session.save(bill);
		session.beginTransaction().commit();
		return "Bill inserted ";
	}

	public String createBill(Bill bill) {
		Session session = factory.openSession();
		session.save(bill);
		session.beginTransaction().commit();
		return "Bill Inserted";
	}

     public List<Bill> getAllBills(){
		
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Bill.class);
		return criteria.list();
	}
}
