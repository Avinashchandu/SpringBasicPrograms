<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>

.button {

colur:green;
background-color: black;
}

</style>

</head>
<body style="background-color: rgba(0,0,0,0.8);">
<center>
<div style="background-color:rgba(255,255,255,0.4); margin-top: 190px;border: solid;border-color: white ;border-width: 5px ;height: 250px;width:250px;padding:30px;border-radius: 10px">
<h1 style="color: silver;font-family:times;">Admin Login</h1>
<%
if(request.getAttribute("answer")!=null)
{
%><%=request.getAttribute("answer")%><% 	
}
%>
<form action="login">
<input name="email" placeholder="Enter your email" style="background-color: black;border-radius:10px;border-bottom-color: black;padding: 5px"><br><br>
<input name="password" placeholder="Enter your password" style="background-color: black;border-radius:10px;border-bottom-color: black;padding: 5px"><br><br>
<input class="button" type="submit" >
</form>
</div>
</center>
</body>
</html>