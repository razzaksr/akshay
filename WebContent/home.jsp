<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%String got=(String)request.getAttribute("who"); %>
<h1>Welcome to home............<%=got %></h1>
</body>
</html>