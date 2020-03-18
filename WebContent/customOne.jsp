<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom tags</title>
</head>
<body>
<%@ taglib prefix="ak" uri="/WEB-INF/akshay.tld" %>
<ak:kumar></ak:kumar>
<br>
<ak:yercaud end="11" start="9"> Mohamed</ak:yercaud>
<ak:yercaud end="10" start="7"> Sabari</ak:yercaud>
<ak:findMin stop="10" initiate="1"><br>Akshay Kumar</ak:findMin>
</body>
</html>