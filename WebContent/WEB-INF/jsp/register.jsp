<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register User</title>
</head>
<body>
	<form:form action="submit" modelAttribute="user">  
        First name: <form:input path="firstName" /> <form:errors path="firstName" />
		<br>
		<br>  
        Last name: <form:input path="lastName" /> <form:errors path="lastName" />
		<br>
		<br>
		Key Phrase: <form:input path="key" /> <form:errors path="key" />
		<br>
		<br>
		Password : <form:input path="password" /> <form:errors path="password" />
		<br>
		<br>
		Confirm Password: <form:input path="confirmPassword" /> <form:errors path="confirmPassword" />
		<br>
		<br>
		Email: <form:input path="email" /> <form:errors path="email" />
		<br>
		<br>
		Gender:   <br>
        Male <form:radiobutton path="gender" value="Male" />  
        Female <form:radiobutton path="gender" value="Female" />
		<br>
		<br>  
        Language:  <br>
        Java<form:checkbox path="language" value="Java" /> 
        Python<form:checkbox path="language" value="Python" />
        Ansible<form:checkbox path="language" value="Ansible" />
		<br>
		<br>  
         Education: <form:select path="education">
			<form:option value="Bachleors" label="Bachleors" />
			<form:option value="Master" label="Master" />
			<form:option value="Basic" label="Basic" />
			<form:option value="Ph.D" label="Ph.D" />
		</form:select>
		<br>
		<br>
		<input type="submit" value="Register" />
	</form:form>
</body>
</html>