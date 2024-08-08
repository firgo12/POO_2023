<%@page import="exercicio.entidade.Cliente"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% 	Cliente cliente = (Cliente) session.getAttribute("cliente");
	   	double conta = (double) request.getAttribute("conta");
	%>
	
	<h1><%= cliente.nome() 
		//= --> out.println(cliente.nome);
		%></h1>
	<h1><%= conta %></h1>
	
	<a href="index.jsp">Voltar</a>
	
</body>
</html>