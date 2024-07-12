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
<%=request.getAttribute("answer") %>
<form action="login">
<input name="email" placeholder="Enter your email">
<input name="password" placeholder="Enter your password">
<input type="submit">
</form>
</center>
</body>
</html>