<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Core's</title>
</head>
<body>
<%@ taglib prefix="akshay" uri="/WEB-INF/c.tld" %>
<akshay:catch var="obj">
<%int[] make={12,45,88};%>
<%=make[3] %>
</akshay:catch>
<akshay:remove var="obj"/>
<akshay:set var="obj" value="987"/>
<akshay:out value="${obj }"></akshay:out>
<form action="jstlTwo.jsp">
<select name="role">
<option>Select Any Role</option>
<option>Automation Engineer</option><option>Data Scientist</option>
<option>Full Stack Developer</option><option>Automation Tester</option>
</select><input type="submit" value="accept">
</form>
</body>
</html>