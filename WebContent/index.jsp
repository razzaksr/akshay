<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greet and Get</title>
</head>
<body>
<%
String m=(String)request.getAttribute("msg");
if(m!=null){%>
<h5 style="color:red;"><%=m %></h5>
<%} %>
<form action="sign" method="post">
<input type="text" name="user" placeholder="UserName"><br><br>
<input type="password" name="pass" placeholder="Password"><br><br>
<input type="submit" value="Login"><input type="reset" value="Clear">
</form>
</body>
</html>