<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Page</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name: <form:input path="firstName"/><br/>
		Second name <form:input path="lastName"/><br/>
		<input type="submit" value="Submit Form" />
	</form:form>
</body>
</html>