<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<h1>Hier kommt Content aus ner Bohne!</h1>
	<jsp:useBean id="bohne1" class="uebungen10jsp2.TestBean"></jsp:useBean>
	<table>
	<c:forEach items="${bohne1.getPersons()}" var="item">
		<tr><td><c:out value="${item.value}"/></td><td><c:out value="${item.key}"/></td></tr>
	</c:forEach>
	</table>
</body>
</html>