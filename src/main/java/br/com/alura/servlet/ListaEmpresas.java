package br.com.alura.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.modelo.Banco;
import br.com.alura.modelo.Empresa;

@WebServlet("/listaEmpresas")
public class ListaEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco nubank = new Banco();

		List<Empresa> listaEmpresas = nubank.listaEmpresas();
			
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/ListaEmpresas.jsp");
		
		request.setAttribute("lista", listaEmpresas);
		
		requestDispatcher.forward(request, response);
		
	}

}
