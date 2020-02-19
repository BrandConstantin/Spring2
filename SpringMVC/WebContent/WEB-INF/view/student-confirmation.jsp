<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration confirmation</title>
</head>
<body>
<p> The student is confirmed: <b>${student.firstName} ${student.lastName}</b></p>
<p>For the country <b>${student.country}</b></p>
<p>The country for Erasmus is <b>${student.erasmusCountry}</b></p>
<p>He will be programming in <b>${student.favoriteLanguage}</b></p>
</body>
</html>