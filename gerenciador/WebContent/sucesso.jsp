<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String nome = (String) request.getAttribute("nomeEmpresa");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	Empresa <% out.println(nome); %> cadastrada com sucesso !
</body>
</html>