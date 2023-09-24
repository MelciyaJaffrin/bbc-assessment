package com.bbc.utilitybillingapplication.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bbc.utilitybillingapplication.model.Otp;

@RestController
public class OtpController {
	
	@PostMapping("otp")
	
	public String addOtp(@RequestBody Otp otp) {
		return null;
		//return otpService.addOtp(otp);
	}

}
