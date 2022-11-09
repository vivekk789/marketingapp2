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
	<h1>update Leads</h1>
	<form action="updateOneLead" method="post">
	<pre>
	<input type="hidden" name="id" value="${lead.id }"/>
	Name    <input type="text" name="name" value="${lead.name}"/>
	Surname <input type="text" name="surname" value="${lead.surname}"/>
	Email   <input type="text" name="email" value="${lead.email}"/>
	Mobile  <input type="text" name="mobile" value="${lead.mobile}"/>
	<input type="submit" value="update"/>
	</pre>
	</form>
	${msg}
</body>
</html>