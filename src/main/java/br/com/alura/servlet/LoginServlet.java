package br.com.alura.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.modelo.Banco;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Banco banco = new Banco();
		
		boolean buscaUsuario = banco.buscaUsuario(login, senha);
	
		
		if(buscaUsuario) {
			
			
			response.sendRedirect("listaEmpresas");
			
		}
		else {
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/view/formLogin.jsp");
			
			requestDispatcher.forward(request, response);
			
		}
	
	
	}

}
