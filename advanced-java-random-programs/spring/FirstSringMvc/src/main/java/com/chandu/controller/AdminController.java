package com.chandu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chandu.dao.EmployeeDao;

@Controller
public class AdminController {
	
	@Autowired
	HttpSession httpSession;

	@Autowired
	HttpServletRequest request1;

	@Autowired
	EmployeeDao dao;

	
	@RequestMapping("/login")
	public String loginAdmin(String email,String password,Model model)
	{
	int res = dao.admindetails(email, password);
	if(res==1)
	{
		
		return "redirect:displayAlldetails";
	}
	else	
	{
		model.addAttribute("answer","Invalid details");
		return "index";
	}
		
	}

}
