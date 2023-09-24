package com.bbc.utilitybillingapplication.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
public class Payment {
	
//	@Id
	private int paymentId;
	private double amount;
	private LocalDate paymentDate;
	private String paymentMethod;
	private Bill associatedBill;
//	
//	@ManyToOne
//    @JoinColumn(name = "bill_id")
//    private Bill bill;

}
