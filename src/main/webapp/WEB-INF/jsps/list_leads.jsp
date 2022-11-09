<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
     <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Leads</title>
</head>
<body>
<h1>All Leads</h1>
<table border="3">
	<tr>
	 <th>Name</th>
	 <th>Surname</th>
	 <th>Email</th>
	 <th>Mobile</th>
	 <th>Delete</th>
	 <th>Update</th>
	</tr>
	
	<c:forEach var="lead" items="${leads}">
	<tr>
	 <td>${lead.name}</td>
	 <td>${lead.surname}</td>
	 <td>${lead.email}</td>
	 <td>${lead.mobile}</td>
	 <td><a href="deleteLead?id=${lead.id}">Delete</a></td>
	 <td><a href="updateLead?id=${lead.id}">Update</a></td>
	</tr>
	
	</c:forEach>
	
</table>
</body>
</html>