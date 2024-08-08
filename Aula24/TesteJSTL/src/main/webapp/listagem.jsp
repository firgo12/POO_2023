<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%	List<String> lista = (List<String>) request.getAttribute("lista"); %>
	<c:forEach var="nome" items="${lista}">
		<c:out value="${nome }"></c:out>
	</c:forEach>

</body>
</html>