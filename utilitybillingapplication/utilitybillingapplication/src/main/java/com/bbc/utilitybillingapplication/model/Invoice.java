package com.bbc.utilitybillingapplication.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@Entity
public class Invoice {
	
	///@Id
	private int invoiceId;
	private long invoiceNumber;
    private Customer customer;
    private LocalDate invoiceDate;
	

}
