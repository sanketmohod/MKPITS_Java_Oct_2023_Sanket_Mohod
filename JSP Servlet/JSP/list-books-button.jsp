<%@page import="com.mkpits.books.ModelBooks"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="StyleSheet" href="css/style.css">
<link type="text/css" rel="StyleSheet" href="css/add-student-style.css">

</head>
<%
// get the student the request dispatcher
List<ModelBooks> theStudents = (List<ModelBooks>)request.getAttribute("STUDENT_LIST");
%>
<body>
	<div id=wrapper">
		<div id="header">
			<h2>Books University</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
		<input type="button" value="Add "
		onclick="window.location.href='add-books-form.jsp'; return false;"
		class="add-student-button">
			<table border="1">
				<tr>
					<th>Id</th>
					<th>Title</th>
					<th>Author</th>
					<th>Date</th>
					<th>Genres</th>
					<th>Characters</th>
					<th>Synopsis</th>
					
				</tr>
				<c:forEach var="tempBooks" items ="${STUDENT_LIST}">
					<tr>
					  <td>${tempBooks.id} </td>
                      <td>${tempBooks.title} </td>
                      <td>${tempBooks.author} </td>
                      <td>${tempBooks.date} </td>
                      <td>${tempBooks.genres} </td>
                      <td>${tempBooks.characters} </td>
                      <td>${tempBooks.synopsis} </td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>