package com.bbc.utilitybillingapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbc.utilitybillingapplication.dao.TransactionDao;
import com.bbc.utilitybillingapplication.model.Transaction;

@Service
public class TransactionService {
	
	@Autowired
	TransactionDao transactionDao;
	
	public List<Transaction> getAllTransactions(){
		return transactionDao.getAllTransactions();
	}
	

}
