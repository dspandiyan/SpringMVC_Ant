<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC - Login Page</title>
<script type="text/javascript">

</script>
</head>
<body>
<h3><spring:message code="springmvc.login.welcomeMessage"></spring:message></h3>
Language : <a href="?language=en">English</a>|<a href="?language=zh_CN">Chinese</a>|<a href="?language=de_DE">German</a>|<a href="?language=fr_FR">French</a><br><br>
<form:form commandName="USER_DETAILS" action="/springmvc/login/loginCheck" method="post">
	<%-- <label>User Name:</label><form:input path="emailId" id="emailId"/><br><br>
	<label>Password:</label><form:password path="password" id="password"/><br><br>
	<input type="submit" value="Login"/> <input type="button" value="Cancel"/> --%>
	<spring:message code="springmvc.login.mailId"></spring:message><form:input path="emailId" id="emailId"/><br><br>
	<spring:message code="springmvc.login.password"></spring:message><form:password path="password" id="password"/><br><br>
	<input type="submit" value="Login"/> <input type="button" value="Cancel"/>
</form:form>
</body>
</html>