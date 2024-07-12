<%@page import="com.chandu.mdel.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body >
<% List<Employee> list = (List<Employee>)request.getAttribute("list"); %>
<table border="10px" >
<tr>
<th>Employee Name</th>
<th>Employee sal</th>
<th>Employee deptno</th>
</tr>
<% for(int i =0;i<list.size();i++){%>
<tr>

<td><%=list.get(i).getEmployeename() %></td>
<td><%=list.get(i).getEmployeesalary() %></td>
<td><%=list.get(i).getDeptno()%></td>
<td><form action="update"><input value="<%=(int)list.get(i).getEmployeeid() %> " hidden="true"  name="id"><input type="submit" value="update"></form></td>
<td><form action="remove"><input value="<%=list.get(i).getEmployeeid() %>" hidden="true" name="id" ><input type="submit" value="delete"></form></td>
<%}; %>
</tr>
</table>

</body>
</html>