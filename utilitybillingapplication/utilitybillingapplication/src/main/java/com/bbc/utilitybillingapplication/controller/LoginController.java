package com.bbc.utilitybillingapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbc.utilitybillingapplication.model.Otp;
import com.bbc.utilitybillingapplication.service.LoginService;

@CrossOrigin()
@RestController
@RequestMapping("login")
public class LoginController {
	
	@Autowired
    LoginService loginService;
	
	
	public LoginController(LoginService loginService) {
		this.loginService = loginService;
	}
	
	@PostMapping("generate-otp/{employeeId}")
	public String generateOtp(@PathVariable int employeeId) {
		loginService.generateOtp(employeeId);
		return "otp generated";
	}
	
	
	@PostMapping("login")
	public String loginCustomer(@RequestBody Otp otp) {
		return loginService.checkLogin(otp);
	}

}
