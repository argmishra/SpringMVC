<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Confirmation</title>
</head>
<body>
	<p>Please, re-check the details.</p>
	First Name : ${user.firstName}
	<br> Last Name : ${user.lastName}
	<br> Key : ${user.key}
	<br> Gender : ${user.gender}
	<br> Email : ${user.email}
	<br> Language :
	<ul>
		<c:forEach var="lan" items="${user.language}">
			<li>${lan}</li>
		</c:forEach>
	</ul>
	<br>
	Education : ${user.education}
</body>
</html>