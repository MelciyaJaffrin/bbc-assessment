package com.bbc.utilitybillingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbc.utilitybillingapplication.model.Customer;
import com.bbc.utilitybillingapplication.model.Transaction;
import com.bbc.utilitybillingapplication.service.TransactionService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("transaction")
public class TransactionController {
	
	@Autowired
	TransactionService transactionService;
	
	@GetMapping("getAllTransactions")
	public List<Transaction> getAllTransactions(){
		return transactionService.getAllTransactions();
		
	}

}
