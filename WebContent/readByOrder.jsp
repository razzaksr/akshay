<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Read An Project</title>
</head>
<body>
<%
response.addHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.addHeader("Pragma", "no-cache");
response.addHeader("Expiry", "0");
String got=(String)session.getAttribute("who"); 
if(got!=null){%>
<h1>Welcome to home............<%=got %></h1>
<%
String m=(String)request.getAttribute("msg");
if(m!=null){%>
<h5 style="color:red;"><%=m %></h5>
<%} %>
<form action="fetch" method="post">
<input type="text" name="number"><br><br>
OR
<input type="text" name="tech" placeholder="Read by technology"><br><br>
OR
<input type="text" name="start" placeholder="Start date">
<input type="text" name="end" placeholder="End date"><br><br>
<input type="submit" value="Read">
</form>
<h3><a href="home.jsp">Home</a></h3>
<h3><a href="logout.jsp">Logout</a></h3>
<%}else{response.sendRedirect("index.jsp");} %>
</body>
</html>