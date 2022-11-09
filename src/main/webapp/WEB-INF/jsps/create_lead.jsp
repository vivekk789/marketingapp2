<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>leads</title>
</head>
<body>
	<h1>Create Leads</h1>
	<form action="save" method="post">
	<pre>
	Name    <input type="text" name="name"/>
	Surname <input type="text" name="surname"/>
	Email   <input type="text" name="email"/>
	Mobile  <input type="text" name="mobile"/>
	<input type="submit" value="save"/>
	</pre>
	</form>
	${msg}
</body>
</html>