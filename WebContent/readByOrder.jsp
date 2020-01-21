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
String m=(String)request.getAttribute("msg");
if(m!=null){%>
<h5 style="color:red;"><%=m %></h5>
<%} %>
<form action="fetch" method="post">
<input type="text" name="number"><br><br>
<input type="submit" value="Read">
</form>
</body>
</html>