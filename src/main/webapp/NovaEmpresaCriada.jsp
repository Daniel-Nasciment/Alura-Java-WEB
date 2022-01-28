<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- EXPRESSION LANGUAGE NÃO FAZ LAÇO -->
	<c:if test="${not empty empresa}">
		<h1>A empresa ${empresa} foi cadastrada com sucesso!</h1>
	</c:if>
	
	<c:if test="${empty empresa}">
		<h1>A empresa não foi cadastrada!</h1>
	</c:if>
	
</body>
</html>