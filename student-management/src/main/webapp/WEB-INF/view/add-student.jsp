<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<body>
	<div align="center">
	<h1>Add Student</h1>
	<form:form action="saved-student" modelAttribute="student" method="POST">
	
		<form:hidden path="id"/>
		
		<label>Name: </label>
		<form:input path="name"/> 
		</br>
		<label>Mobile: </label>
		<form:input path= "mobile"/>
		</br>
		<label>Country: </label>
		<form:input path= "country"/>
		</br>
		<input type= "submit" value= "Submit"/>
	</form:form>
	</div>
</body>
</html>