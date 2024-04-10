<%@page import="com.mkpits.jdbc.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%
// get the student the request dispatcher
List<Student> theStudents = (List<Student>) request.getAttribute("STUDENT_LIST");
%>
<body>
	<div id=wrapper">
		<div id="header">
			<h2>Mkpits University</h2>
		</div>
	</div>

	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				<%
				for (Student tempStudent : theStudents) {
				%>
				<tr>
					<td><%=tempStudent.getId()%></td>
					<td><%=tempStudent.getfName()%></td>
					<td><%=tempStudent.getlName()%></td>
					<td><%=tempStudent.getEmail()%></td>
				</tr>
				<%
				}
				%>
			</table>
		</div>
	</div>
</body>
</html>