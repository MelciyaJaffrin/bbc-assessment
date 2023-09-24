package com.bbc.utilitybillingapplication.model;


import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Transaction {
	@Id
	private long transactionId;
	private long customerId;
	private long billId;
	private String transactionStatus;
	private LocalDate transactionDate;
	private String paymentMethod;

}
