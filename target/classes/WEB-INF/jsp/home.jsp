<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
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
			href="<c:url value="/homepage"/>">Home <span class="sr-only">(current)</span></a></li>
		<li class="nav-item active"><a class="nav-link"
			href="<c:url value="/mypets"/>">My Pets <span class="sr-only">(current)</span></a></li>
			<li class="nav-item active"><a class="nav-link"
			href="<c:url value="/addpet"/>">Add Pet <span class="sr-only">(current)</span></a></li>	
			<li class="nav-item active"><a class="nav-link"
			href="<c:url value="/"/>">Sign Out </a></li>			
</nav>
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
<h2>inside home</h2>
<table border="1">
<tr>
     <td>Pet Id </td>
     <td>Pet Name</td>
     <td>Pet Age</td>
     <td>Pet Place</td>
     <td>Acion</td>
 </tr>
 <c:forEach items="${petList}" var="pet">
<tr>
    <td>${pet.petId}</td>
    <td>${pet.petName}</td>
    <td>${pet.petAge}</td>
    <td>${pet.petPlace}</td>
       <td id="sold"><a href="<c:url value='/buypet/${pet.petId }'/>">Buy Pet</</a></td>
    </tr>
</c:forEach>  
     
</table>
<script type="text/javascript">
   function setSoldOut(){
	   document.getElementById("sold").innerHTML="sold out"
   }
</script>
</body>
</html>