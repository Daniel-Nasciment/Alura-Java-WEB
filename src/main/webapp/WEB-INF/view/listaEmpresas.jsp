
<%@ page import = "java.util.List, br.com.alura.modelo.Empresa, br.com.alura.modelo.Usuario "  %>
<% List<Empresa> lista = (List<Empresa>)request.getAttribute("lista"); %>
<% Usuario usuario = (Usuario) request.getAttribute("usuarioLogado"); %>
<!-- ESSE IMPORT É PARA USAR O FOREACH E OUTRAS TAGS DESSA BIBLIOTECA -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/logout" var="urlContext"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	
	<h1>Usuário: ${usuarioLogado.login}</h1>
	
	<br>
	
	<a href="${urlContext}">Sair</a>
	
	<br>
	
	<ul>
		
		<c:forEach items="${ lista }" var="empresa">
		
			<li>${ empresa.nome } <fmt:formatDate value="${ empresa.data }" pattern="dd/MM/yyyy"/> </li>
		
		</c:forEach>
	
	</ul>
	
</body>
</html>