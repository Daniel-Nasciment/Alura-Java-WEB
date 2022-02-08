<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/login" var="urlContext"/>

<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>

<!-- O CONTEXTO DA APLICAÇÃO (O NOME "gerenciador"É ALGO VARIÁVEL, OU SEJA, PARA NOS PREVINIRMOS
É UMA BOA PRATICA UTILIZAR DO JSTL PARA QUE ELE PEGUE ESSE PARAMETRO DE CONTEXTO -->

	<form action="${urlContext}" method="post">
	
		Login: <input type="text" name="login" />
		Senha: <input type="password" name="senha" />
		
		
		<input type="submit" />
	
	</form>

</body>
</html>