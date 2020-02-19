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
		Country: <form:select path="country">
					<form:option value="France" label="France"></form:option>
					<form:option value="Italy" label="Italy"></form:option>
					<form:option value="Spain" label="Spain"></form:option>
					<form:option value="Romania" label="Romania"></form:option>
					<form:option value="Portugal" label="Portugal"></form:option>
				</form:select><br/>
		Erasmus Country: <form:select path="erasmusCountry">
						<form:options items="${student.erasmusCountry}" />
					</form:select><br/>
		<input type="submit" value="Submit Form" />
	</form:form>
</body>
</html>