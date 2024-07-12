package com.chandu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class EmployeeController {
	
	@Autowired
	HttpSession httpSession;
	
	@RequestMapping("/registrationPage")
	public String employeeregistrationpage() {
		return "Resgistration.jsp";

	}
	
	@RequestMapping("/registration")
	public String employeeRegistration(String employeename,String email,int password,HttpServletRequest request) {
		//HttpSession httpSession = request.getSession();
		httpSession.setAttribute("employeename", employeename);
		httpSession.setAttribute("employeeemail", email);
		httpSession.setAttribute("employeepassword", password);
	return "redirect:/selection";
		
	}
	@RequestMapping("/updation")
	//@ResponseBody
	public String employeeUpdation(@RequestParam("EmployeeDeptno")int deptno ,Model model) {
		System.out.println(deptno);
		model.addAttribute("val", deptno);
		return "update.jsp";
		
	}
	@RequestMapping("/deletion")
    public String employeeDeletion(HttpServletRequest httpServletRequest) {
		
		return "deletion Successfull";
	
}
	@RequestMapping("/selection")
	public String selectEmployee(HttpServletRequest request1,Model model)
	{
		//HttpSession request = request1.getSession();
		//System.out.println((String)request.getAttribute("employeename"));
		model.addAttribute("name", httpSession.getAttribute("employeename"));
		model.addAttribute("email", httpSession.getAttribute("employeeemail"));
		model.addAttribute("password", httpSession.getAttribute("employeepassword"));
		return "allEmployeeDetails.jsp";
		
	}
}
