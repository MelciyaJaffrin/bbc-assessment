package com.bbc.utilitybillingapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbc.utilitybillingapplication.dao.OtpDao;

@Service

public class OtpService {
	
	@Autowired
	OtpDao otpDao;
	public int generateOtp() {
		int otp = (int) (Math.random() * 900000) + 100000;
        return otp;
	}
}
