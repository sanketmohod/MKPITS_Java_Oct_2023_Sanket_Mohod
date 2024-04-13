<%@page import="com.mkpits.jdbc1.Student_Model"%>
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
</head>
<%
// get the student the request dispatcher
List<Student_Model> theStudents = (List<Student_Model>) request.getAttribute("STUDENT_LIST");
%>
<body>
	<div id=wrapper">
		<div id="header">
			<h2>Mkpits University</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table border="1">
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach var="tempStudent" items ="${STUDENT_LIST}">
					<tr>
					  <td>${tempStudent.id} </td>
                      <td>${tempStudent.fName} </td>
                      <td>${tempStudent.lName} </td>
                      <td>${tempStudent.email} </td>
                      <td>Add Link Here </td>
         
					</tr>
				</c:forEach>
			</table>
		</div>
	</div>
</body>
</html>