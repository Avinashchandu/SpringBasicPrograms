<%@page import="com.chandu.mdel.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<%Employee employee = (Employee)request.getAttribute("emp");%>
<form action="updates">
<input value="<%=employee.getEmployeeid() %> " hidden="true"  name="id">
Name   :: <input value="<%=employee.getEmployeename()%>" name="name">
salary :: <input value="<%=(int)employee.getEmployeesalary()%>" name="sal">
deptno :: <input value="<%=(int)employee.getDeptno()%>" name="deptno">
<input type="submit">
</form>
</center>
</body>
</html>