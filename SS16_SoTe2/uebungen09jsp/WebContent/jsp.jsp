<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/uebungen09jsp/jsp.jsp" method="post">
		<input type="text" name="in01">
		<input type="text" name="in02">
		<input type="text" name="in03">
		<input type="submit">
	</form>
	<% 
	int result = 0;
	if(request.getAttribute("in01") != "" && request.getAttribute("in02") != "" && request.getAttribute("in03") != "") {
		int a = Integer.parseInt(request.getAttribute("in01"));
		String zeichen = request.getParameter("in02");
		int b = Integer.parseInt(request.getParameter("in03"));
		if(zeichen.equals("+")){
			result = a + b;
		} else if(zeichen.equals("-")){
			result = a - b;
		} else if(zeichen.equals("*")){
			result = a * b;
		} else if(zeichen.equals("/")){
			result = a / b;
		}
	}
	%>
	<div>Ergebnis: <%= request.getParameter("in01") %> <%= request.getParameter("in02") %> <%= request.getParameter("in03") %> = <%= result %></div>

</body>
</html>
