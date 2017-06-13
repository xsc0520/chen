<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
success

<a href="redirect2?name=xishuchen&pass=xishuchen&time=100">test @redirect2</a>
<a href="redirect2/xishuchen/7521">test @redirect2</a>
	<form action=" testPOJO" method="POST">
		username: <input type="text" name="username"/><br>
		password: <input type="password" name="password"/><br>
		email: <input type="text" name="email"/><br>
		age: <input type="text" name="age"/><br>
		city: <input type="text" name="address.city"/><br>
		province: <input type="text" name="address.province"/>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>