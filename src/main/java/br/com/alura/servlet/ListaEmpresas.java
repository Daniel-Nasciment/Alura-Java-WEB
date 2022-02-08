package br.com.alura.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.modelo.Banco;
import br.com.alura.modelo.Empresa;

@WebServlet("/listaEmpresas")
public class ListaEmpresas extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Banco nubank = new Banco();

		List<Empresa> listaEmpresas = nubank.listaEmpresas();

		HttpSession session = request.getSession();

		if (session.getAttribute("usuarioLogado") == null) {
			response.sendRedirect("loginForm");
			return;
		}

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/view/listaEmpresas.jsp");

		request.setAttribute("lista", listaEmpresas);

		requestDispatcher.forward(request, response);

	}

}
