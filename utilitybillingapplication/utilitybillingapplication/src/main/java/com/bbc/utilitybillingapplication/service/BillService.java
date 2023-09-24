package com.bbc.utilitybillingapplication.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbc.utilitybillingapplication.dao.BillDao;
import com.bbc.utilitybillingapplication.model.Bill;
import com.bbc.utilitybillingapplication.model.Customer;

@Service
public class BillService {
	
	@Autowired
	BillDao billDao;
	
    public String insertBill(List<Bill> bills) {
		for(Bill bill:bills) {
			createBill(bill);
		}
		return "inserted";
	}

	public String createBill(Bill bill) {
		System.out.println(bill.getBillDueDate());
		System.out.println(bill.getCustomerId());
		double amount = bill.getUnitsConsumed()*41.50;
		bill.setAmount(amount);
		return billDao.createBill(bill);
	}
	
	public List<Bill> getAllBills(){
		return billDao.getAllBills();
	}

}
