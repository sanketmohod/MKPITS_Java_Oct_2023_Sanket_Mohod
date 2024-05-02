<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="register.css">

</head>
<body>
<div class="container">
  <h1>Registration Form</h1>
  <form action="Registration_Controller" method="post">  <label for="username">Name:</label>
    <input type="text" id="name" name="name" placeholder="Enter your name" required>
    <label for="email">Email:</label>
    <input type="text" id="email" name="email" placeholder="Enter your email" required>
    <label for="gender">Gender:</label>
    <input type="text" id="gender" name="gender" placeholder="Enter your gender" required>
    <label for="city">City:</label>
    <input type="text" id="city" name="city" placeholder="Enter your city" required>
    <label for="mobile">Mobile:</label>
    <input type="text" id="mobile" name="mobile" placeholder="Enter your mobile number" required>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password" placeholder="Enter your password" required>
    <label for="password">Confirm Password:</label>
    <input type="password" id="cpassword" name="cpassword" placeholder="Enter your password again" required>
  </form>
  <a href="login.jsp">Register Here</a>
</div>
</body>
</html>