<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Core's Two</title>
</head>
<body>
<%@ taglib prefix="ak" uri="/WEB-INF/c.tld" %>
<ak:set var="job" value="${param.role }"/>
<ak:choose>
<ak:when test="${job eq 'Automation Engineer' }">
<ak:out value="Please learn Python and AI"/>
</ak:when>
<ak:when test="${job eq 'Full Stack Developer' }">
<ak:out value="Please learn Java script or java"/>
</ak:when>
<ak:when test="${job eq 'Automation Tester' }">
<ak:out value="Please learn Selenium, Load runner, JUnit"/>
</ak:when>
<ak:when test="${job eq 'Data Scientist' }">
<ak:out value="Please learn Python, numpy, sciPy and Machine Learning"/>
</ak:when>
<ak:otherwise>
<ak:out value="Please learn Python core atleast"/>
</ak:otherwise>
</ak:choose>

<ak:forEach var="hey" begin="11" end="20">
<ak:if test="${hey == 2 || hey == 3 || hey == 5 || hey == 7 || hey%2!=0 && hey%3!=0 && hey%5!=0 && hey%7!=0}">
<ak:out value="${hey }"/>
</ak:if>
</ak:forEach>
<a href="jstlThree.jsp">Data base</a>
</body>
</html>