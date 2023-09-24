package com.bbc.utilitybillingapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bbc.utilitybillingapplication.dao.OtpDao;
import com.bbc.utilitybillingapplication.model.Otp;

@Service

public class LoginService {
	
	OtpService otpService;
	OtpDao otpDao;
	@Autowired
	public LoginService (OtpService otpService,OtpDao otpDao) {
		this.otpService = otpService;
		this.otpDao = otpDao;
	}
	
	public void generateOtp(int employeeId) { 
		Otp otpObj = new Otp();
		otpObj.setId(employeeId);
		otpObj.setOtp(otpService.generateOtp());
		otpDao.saveOtp(otpObj);
	}
	
	public String checkLogin (Otp otp) {
		Otp otpObj = otpDao.getOtp(otp.getId());
		if(otpObj.getOtp()==otp.getOtp()) {
			return "true";
		} else {
			return "false";
		}
	}

}
