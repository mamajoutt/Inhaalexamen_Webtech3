<%@page import="edu.ap.json.JSONFactory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quotes result</title>
</head>
<body>
	<%
		String search = request.getParameter("search");
		if (search != null){
	%>
		<h1>Gevonden medicijn voor "<%= search %>":</h1>
	<%
		String gevondenmedicijn = JSONFactory.getMedicijn(search);
	%>
		<p><%=gevondenmedicijn%></p>p>
	<%
		
		}
		
	%>
	<a href="Medicijnen.jsp">Back to Search</a>
</body>
</html>