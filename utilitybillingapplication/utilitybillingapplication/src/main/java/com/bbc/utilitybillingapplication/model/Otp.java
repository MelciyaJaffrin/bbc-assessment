package com.bbc.utilitybillingapplication.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Otp {
	
	@Id
	int id;
	int otp;

}
