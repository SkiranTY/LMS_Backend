<%@page import="java.util.List"%>
<%@page import="com.tyss.tysslibrary.dto.Books"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    List<Books> books=(List) session.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Search books</h2>
<div class="form-group">
<input type="search" value="search book name" class="form-control">
</div>
<div>
<button type="submit" value="search">Search</button>
</div>
</body>
</html>