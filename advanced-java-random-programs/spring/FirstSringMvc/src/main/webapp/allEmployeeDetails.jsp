<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<table>
<tr>
<th>Name</th>
<th>Email</th>
<th>Password</th>
</tr>

<tr>
<td><%=request.getAttribute("name")%></td>
<td><%=request.getAttribute("email")%></td>
<td><%=request.getAttribute("password")%></td>
</tr>
</table>

</body>
</html>