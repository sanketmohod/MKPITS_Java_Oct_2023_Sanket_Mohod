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
<body>
	<div id=wrapper">
		<div id="header">
			<h2>Books University</h2>
		</div>
	</div>

	<div id="container">
		<h3>Add Student</h3>
		<form action="BooksControllerServletNew" method="get">
			<input type="hidden" name="command" value="ADD">

			<table>
				<tbody>
					<tr>
						<td><label>Title : </label></td>
						<td><input type="text" name="firstName"></td>
					</tr>

					<tr>
						<td><label>Author : </label></td>
						<td><input type="text" name="lastName"></td>
					</tr>

					<tr>
						<td><label>Date : </label></td>
						<td><input type="text" name="email"></td>
					</tr>
					
					<tr>
						<td><label>Genres : </label></td>
						<td><input type="text" name="email"></td>
					</tr>
					
					<tr>
						<td><label>Characters : </label></td>
						<td><input type="text" name="email"></td>
					</tr>
					
					<tr>
						<td><label>Synopsis : </label></td>
						<td><input type="text" name="email"></td>
					</tr>

					<tr>
						<td><input type="submit" value="save" class="save"></td>
					</tr>
				</tbody>
			</table>
		</form>

		<div style="clear: both;"></div>
			<p>
				<a href="BooksControllerServletNew">Back to the list</a>
			</p>
		</div>
	</div>
</body>
</html>