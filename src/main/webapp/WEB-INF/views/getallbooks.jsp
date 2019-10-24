<%@page import="java.util.List"%>
<%@page import="com.tyss.tysslibrary.dto.Books"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%
    List<Books> books= (List) request.getAttribute("list");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
<a href="./home">Home</a>
</div>
<table>
	<tr>
		<th>Book_Id</th>
		<th>Book_Name</th>
		<th>Author</th>
		<th>Category</th>
	</tr>
	<%
		for(Books book: books){
	%>	
	<tr>
	<td><%=book.getbId() %></td>
	<td><%=book.getbName() %></td>
	<td><%=book.getbAuthor() %></td>
	<td><%=book.getbCategory() %></td>
	</tr>
	<%
		}
	%>
</table>
</body>
</html>