<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
		<tr>
		<thead>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Email</th>
		</thead>
		</tr>


		<c:forEach var="tempStudent" items="${student_list}">

			<tr>
				<td>${tempStudent.fName}</td>
				<td>${tempStudent.lName}</td>
				<td>${tempStudent.email}
				</td>
			</tr>
			<br>
		</c:forEach>
	</table>
</body>
</html>