
<%@ page import = "java.util.List, br.com.alura.modelo.Empresa"  %>
<% List<Empresa> lista = (List<Empresa>)request.getAttribute("lista"); %>
<!-- ESSE IMPORT É PARA USAR O FOREACH E OUTRAS TAGS DESSA BIBLIOTECA -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Java Standard Taglib</title>
</head>
<body>
	
	<ul>
		
		<c:forEach items="${ lista }" var="empresa">
		
			<li>${ empresa.nome }</li>
		
		</c:forEach>
	
	</ul>
	
</body>
</html>