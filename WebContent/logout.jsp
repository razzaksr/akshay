<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Logging out</title>
</head>
<body>
<h1>Logged out</h1>
<%if(session.getAttribute("who")!=null)
{
session.removeAttribute("who");
session.setAttribute("who", null);
response.sendRedirect("index.jsp");
}else{response.sendRedirect("index.jsp");}%>
</body>
</html>