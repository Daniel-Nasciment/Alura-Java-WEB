package br.com.alura.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.modelo.Banco;
import br.com.alura.modelo.Empresa;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String parameter = request.getParameter("nome");

		Empresa empresa = new Empresa();
		empresa.setNome(parameter);

		Banco nuBank = new Banco();

		nuBank.adiciona(empresa);

		// DIRECIONANDO AO ARQUIVO JSP
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/NovaEmpresaCriada.jsp");

		// ANTES DE ENCAMINHAR, AMARRO A REQUEST UM ATRIBUTO COM O NOME E O VALOR, DESSA
		// FORMA
		// POSSO ACESSA-LO NO ARQUIVO.JSP
		request.setAttribute("empresa", empresa.getNome());

		// ENCAMINHADO
		requestDispatcher.forward(request, response);
	}

}
