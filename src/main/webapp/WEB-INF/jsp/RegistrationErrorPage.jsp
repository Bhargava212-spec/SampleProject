<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>RegistrationError Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<a class="navbar-brand" href="home.html">PET SHOP</a>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarSupportedContent"
		aria-controls="navbarSupportedContent" aria-expanded="false"
		aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>

	<div class="nav navbar-navnavbar-right" id="navbarSupportedContent">

		<li class="nav-item active"><a class="nav-link"
			href="<c:url value="/loginpage"/>">Login <span class="sr-only">(current)</span></a></li>
	</div>
</nav>



<h1 style="color: white;" align="center">this is the home page</h1>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>
<font color="red"><h4>${message }<br></h4></font>

	<c:url var="userAction" value="/saveUser" />
	<form:form action="${userAction }" method="get" modelAttribute="userForm">
		<table>
			<tr>
				<td>Name:</td>
				<td><form:input type="text" path="userName" size="20"
						maxlength="20" autocomplete="off" /><font color="red"><form:errors path="userName"/></font></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><form:input type="text" path="password" /></td>
			</tr>
			<tr>
				<td>Confirm Password:</td>
				<td><form:input type="password" path="confirmpassword" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" /></td>
		</table>
	</form:form>
</body>
</html>