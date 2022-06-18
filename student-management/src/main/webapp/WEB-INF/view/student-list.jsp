<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">

<link rel="styleSheet" type="text/css" href= "/student-management/URLToReachResourcesFolder/css/addPageBackground.css">
<link rel="stylesheet" type="text/css" href= "/student-management/URLToReachResourcesFolder/css/custom-style-sheet.css">
</head>
<body class="myFonts">
	<h1 align="center">STUDENT INVENTORY</h1>
	<div align= "center">
	
	<form action="showAddStudentPage">
	
	<input type= "submit" value= "ADD" class= "myButton">
	
	</form>
	<table border="1" class="myTable">
		<thead>
			<tr>
			 <td>id</td>
		     <td>name</td>
				<td>mobile</td>
				<td>country</td>
			</tr>
		</thead>
		<c:forEach var="student" items="${students}">
			<tr>
				<td>${student.id}</td>
				<td>${student.name}</td>
				<td>${student.mobile}</td>
				<td>${student.country}</td>
				<td><a href="/student-management/updateStudent?userId=${student.id}">Update</a></td>
				<td><a href="/student-management/deleteStudent?userId=${student.id}"
					onclick= "if(!confirm('Are you sure you want to delete this student?'))return false">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	
	<img alt="Students Image" src="/student-management/URLToReachResourcesFolder/images/student.png">
	</div>
</body>
</html>