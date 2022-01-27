
<%@ page import = "java.util.List, br.com.alura.modelo.Empresa"  %>
<% List<Empresa> lista = (List<Empresa>)request.getAttribute("lista"); %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<ul>
		<% for (Empresa emp : lista) { %>
		
			<li><%= emp.getNome() %></li>
		
		<% } %>
	</ul>
	
</body>
</html>