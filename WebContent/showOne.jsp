<%@page import="java.util.ArrayList"%>
<%@page import="akshay.manage.Projects"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show One Project</title>
</head>
<body>
<%
String m=(String)request.getAttribute("msg");
if(m!=null){%>
<h5 style="color:red;"><%=m %></h5>
<%} %>
<%ArrayList<Projects> hai=(ArrayList<Projects>)request.getAttribute("got"); %>
<table border="4" cellspacing="4" cellpadding="4">
<tr></tr>
<%for(Projects pro:hai) {%>
<tr>
<td><%=pro.getPronum() %></td><td><%=pro.getProname() %></td>
<td><%=pro.getProclient() %></td><td><%=pro.getProkickstart() %></td>
<td><%=pro.getProdeadline() %></td><td><%=pro.getProtech() %></td>
<td><%=pro.getPromem() %></td><td><%=pro.getProstatus() %></td>
<td><a href="downs.jsp?no=<%=pro.getPronum()%>">Download Requirement</a></td>
<td><a href="Up?no=<%=pro.getPronum()%>">Edit</a></td>
</tr>
<%} %>
</table>
</body>
</html>