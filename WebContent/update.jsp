<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit to update</title>
</head>
<body>
<form action="modify" method="post">
<input type="text" name="pnum" value="${requestScope.one}" ><br><br>
<input type="text" name="app"  value="${requestScope.two}"><br><br> 
<input type="text" name="client" value="${requestScope.three}" ><br><br>
<input type="text" name="start" value="${requestScope.four}"><br><br>
<input type="file" name="doc" value=""><br><br>
<input type="text" name="end" value="${requestScope.five}" ><br><br>
<input type="text" name="tech"  value="${requestScope.six}"><br><br>
<input type="text" name="status"  value="${requestScope.seven}"><br><br>
<input type="text" name="num" value="${requestScope.eight}" ><br><br>
<input type="submit" value="Update"> <input type="reset" value="Clear">
</form>
</body>
</html>