<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register confirmation</title>
</head>
<body>
<p>Register confirmated for the teacher ${teacher.firstName} ${teacher.lastName}</p>
<p>The total of students are ${teacher.numberStudents}</p>
<p>The teacher code are ${teacher.teacherCode}</p>
</body>
</html>