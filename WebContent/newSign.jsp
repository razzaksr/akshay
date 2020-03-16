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
response.addHeader("Cache-Control", "no-cache, no-store, must-revalidate");
response.addHeader("Pragma", "no-cache");
response.addHeader("Expiry", "0");
String got=(String)session.getAttribute("who"); 
if(got!=null){%>
<h1>Welcome to home............<%=got %></h1>
<%String m=(String)request.getAttribute("msg");
out.println("<h1>Welcome to home............"+config.getInitParameter("hai")+"</h1>");
this.log("Adding new on visited");
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
<h3><a href="home.jsp">Home</a></h3>
<h3><a href="logout.jsp">Logout</a></h3>
<%}else{response.sendRedirect("index.jsp");} %>
</body>
</html>