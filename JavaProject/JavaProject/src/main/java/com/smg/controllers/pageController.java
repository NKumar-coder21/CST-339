package com.smg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class pageController {
	//Go to the login page
	@GetMapping("/login")
	public String goToLogin() {
		return "login";	
	}
	
	//go to the register page
	@GetMapping("/register")
	public String goToRegister() {
		return "register";	
	}
	
	//admin go to the login page
	@GetMapping("/adminlogin")
	public String goAdminLogin() {
		return "adminLogin";	
	}
}
