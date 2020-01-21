<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding new project</title>
</head>
<body>
<%
String m=(String)request.getAttribute("msg");
if(m!=null){%>
<h5 style="color:red;"><%=m %></h5>
<%} %>
<form action="propose" method="post">
<input type="text" name="app" placeholder="Enter the project Name"><br><br>
<input type="text" name="client" placeholder="Enter the Client"><br><br>
<input type="file" name="doc"><br><br>
<input type="text" name="start" placeholder="Start date YYYY-MM-DD"><br><br>
<input type="text" name="end" placeholder="End date YYYY-MM-DD"><br><br>
<input type="text" name="tech" placeholder="Enter the Technology used"><br><br>
<input type="text" name="num" placeholder="Enter the count of resources"><br><br>
<input type="submit" value="Approve"> <input type="reset" value="Clear">
</form>
</body>
</html>