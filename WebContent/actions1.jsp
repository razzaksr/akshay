<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Actions tag</title>
</head>
<body>
${param.student }
${100/2 gt 50}
<form action="actions2.jsp">
<input type="text" name="event"><br>
<input type="text" name="org"><br>
<input type="text" name="rewards"><br>
<input type="text" name="exp"><br>
<input type="submit" value="Log you self">
</form>
</body>
</html>