package com.bbc.utilitybillingapplication.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.bbc.utilitybillingapplication.model.Transaction;

@Repository
public class TransactionDao {
	
	@Autowired
	SessionFactory factory;
	
	public List<Transaction> getAllTransactions(){
		
		Session session = factory.openSession();
		Criteria criteria = session.createCriteria(Transaction.class);
		return criteria.list();
	}

}
