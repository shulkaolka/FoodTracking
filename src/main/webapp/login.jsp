<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
	<form name="loginForm" method="POST" action="FoodServlet">
		<input type="hidden" name="command" value="login" /> 
		Login:<br /> 
		<input type="text" name="login" value="" />
		<br />Password:<br /> 
		<input type="password" name="password" value="" />
		<br /> ${errorLoginPassMessage}
		<br /> ${wrongAction} 
		<br /> ${nullPage} 
		<br /> 
		<input type="submit" value="Log in" />
	</form>
	<hr />
</body>
</html>