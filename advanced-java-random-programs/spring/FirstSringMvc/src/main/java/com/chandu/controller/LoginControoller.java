package com.chandu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chandu.dao.EmployeeDao;
import com.chandu.mdel.Employee;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class LoginControoller {

@Autowired
HttpSession httpSession;

@Autowired
HttpServletRequest request1;

@Autowired
EmployeeDao dao;

	
@RequestMapping("/reg")
public String employeeRegistration(String employeename,String email,int password,HttpServletRequest request) {
	httpSession.setAttribute("employeename", employeename);
	httpSession.setAttribute("employeeemail", email);
	httpSession.setAttribute("employeepassword", password);
return "lgin.jsp";
}

@RequestMapping("/regi")
@ResponseBody
public String Regist(Employee employee)
{
	int  employeedetails = dao.saveEmployeeDetails(employee);
	if(employeedetails!=0)
		return "success";
	else
		return "false";
	
	
	
}

@RequestMapping("/login1")
public String selectEmployee(Model model,@RequestParam("email")String Name,int password)
{
	String  name1 = (String) httpSession.getAttribute("employeeemail");
	int password1 = (Integer) httpSession.getAttribute("employeepassword");
	if(Name.equals(name1)&&password==password1)
	     model.addAttribute("answer", "Login SuccessFul");
    else
    	 model.addAttribute("answer", "Invalid Details");
	return "lgin.jsp";
}

@RequestMapping("/displayAlldetails")
public String displayDetails(Model model) {
	model.addAttribute("list", dao.allEmployeedetsils());
	return "displaydetails";
}

@RequestMapping("/remove")
public String requestMethodName(int id) {
	dao.remove(id);
    return "redirect:displayAlldetails";
}

@RequestMapping("/update")
public String update(Model model,@RequestParam("id")int id) {
	Employee employee = dao.getEmployee(id);
	model.addAttribute("emp",employee);
    return "updates";
}

@RequestMapping("/updates")
public String updates(Model model,int id,String name,int sal,int deptno) {
	int employee = dao.Employeepdate(id,name,sal,deptno);
    return "redirect:displayAlldetails";
}




}
