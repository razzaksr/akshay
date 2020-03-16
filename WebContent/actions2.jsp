<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actions 2 stage</title>
</head>
<body>
<jsp:useBean id="rep" class="akshay.basic.Report"></jsp:useBean>
<jsp:setProperty name="rep" property="*"></jsp:setProperty>

<h1><jsp:getProperty name="rep" property="event"/></h1>
<h1><jsp:getProperty name="rep" property="rewards"/></h1>
<h1><jsp:getProperty name="rep" property="exp"/></h1>
<h1><jsp:getProperty name="rep" property="org"/></h1>

<jsp:include page="index.jsp"/>

</body>
</html>