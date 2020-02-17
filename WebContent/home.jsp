<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<%
response.addHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.addHeader("Pragma", "no-cache");
response.addHeader("Expiry", "0");
String got=(String)session.getAttribute("who"); 
if(got!=null){
Cookie[] coo=request.getCookies();
for(Cookie temp:coo)
{%>
<%=temp.getName() %><%=temp.getValue() %>	
<% }%>
<h1>Welcome to home............<%=got %></h1>
<h3><a href="newSign.jsp">Enrolling New Project</a></h3>
<h3><a href="readByOrder.jsp">Extract Project(s) Information</a></h3>
<h3><a href="logout.jsp">Logout</a></h3>
<%}else{response.sendRedirect("index.jsp");} %>
</body>
</html>