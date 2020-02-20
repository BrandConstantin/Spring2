<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register the teacher</title>
<style type="text/css">
	.error{color:red}
</style>
</head>
<body>
	<p>Asterisk (*) means required.</p>
	<form:form action="processForm" modelAttribute="teacher">
		<p>First name: <form:input path="firstName"/></p>
		<p>Second name (*): <form:input path="lastName"/></p>
		<form:errors path="lastName" cssClass="error"></form:errors>
		<p>Total students (*): <form:input path="numberStudents" type="number"/></p>
		<form:errors path="numberStudents" cssClass="error"></form:errors>
		<p>Code Teacher (*): <form:input path="teacherCode" type="number"/></p>
		<form:errors path="teacherCode" cssClass="error"></form:errors>
		
		<br/><br/>
		<input type="submit" value="Submit Form" />
	</form:form>
</body>
</html>