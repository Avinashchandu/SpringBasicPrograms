package com.chandu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	
	@RequestMapping("/reg")
	public String employeeRegist() {
		return "EmployeeRegistration";
	}

}
