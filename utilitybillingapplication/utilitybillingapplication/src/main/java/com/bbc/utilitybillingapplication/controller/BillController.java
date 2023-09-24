package com.bbc.utilitybillingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbc.utilitybillingapplication.model.Bill;
import com.bbc.utilitybillingapplication.model.Customer;
import com.bbc.utilitybillingapplication.service.BillService;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("bill")
public class BillController {
	
	@Autowired
	BillService billService;
	
    @PostMapping ("insertBill")
	public String insertBill(@RequestBody List<Bill> bill) {
		return billService.insertBill(bill);
	}
    
    @PostMapping("newbill")
    public String createBill(@RequestBody Bill bill) {
		return billService.createBill(bill);
	}
    
    @GetMapping("getAllBills")
    public List<Bill> getAllBills(){
		return billService.getAllBills();
		
	}
    
    


}
