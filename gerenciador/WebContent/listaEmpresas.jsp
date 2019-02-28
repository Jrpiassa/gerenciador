<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
<%@ page import="java.util.List, br.com.jpiassa.gerenciador.model.Empresa" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<ul>
	<%		
		List<Empresa> listaEmpresas = (List<Empresa>)request.getAttribute("listaEmpresas");
		for (Empresa emp : listaEmpresas) {
	%>
			<li><%= emp.getNome()%></li>
	<%		
		}
	 %>
	</ul>
	
</body>
</html>