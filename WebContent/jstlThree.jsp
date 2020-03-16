<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL SQL tags</title>
</head>
<body>
<%@ taglib prefix="ak" uri="/WEB-INF/c.tld" %>
<%@ taglib prefix="q" uri="/WEB-INF/sql.tld" %>
<q:setDataSource var="con" driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/test" user="root" password=""/>
<q:query var="qry" dataSource="${con }" sql="select * from bike"/>
<table border="5">
<ak:forEach var="hai" items="${qry.rows }">
<tr>
<td>${hai.bid }</td><td>${hai.model }</td><td>${hai.milage }</td>
<td>${hai.price }</td>
</tr>
</ak:forEach>
</table>
</body>
</html>