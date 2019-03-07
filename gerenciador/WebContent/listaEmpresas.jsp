<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ page import="java.util.List, br.com.jpiassa.gerenciador.model.Empresa" %> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<ul>
		<c:forEach items="${listaEmpresas}" var="empresa">
			<li>
				Nome: ${empresa.nome} Data abertura: <fmt:formatDate value="${empresa.dataAbertura}" pattern="dd/MM/yyyy" />
				<a href="/gerenciador/removeEmpresa?id=${empresa.id}">Remover</a>
				<a href="/gerenciador/mostrarEmpresa?id=${empresa.id}">Editar</a>
			</li>
		</c:forEach>
	</ul>
	
</body>
</html>