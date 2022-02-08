package br.com.alura.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.modelo.Banco;
import br.com.alura.modelo.Usuario;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		Banco banco = new Banco();
		
		Usuario buscaUsuario = banco.buscaUsuario(login, senha);
	
		
		if(buscaUsuario != null) {
			
			// session � um objeto onde � armazenado as informa��es do usu�rio
			// � um objeto que sobrevive mais de uma requisi��o, o JSESSIONID � passado a partir da primeira requisi��o
			// eu consigo pegar esse JSESSIONID atrav�s da requisi��o
			HttpSession session = request.getSession();
			session.setAttribute("usuarioLogado", buscaUsuario);
			response.sendRedirect("listaEmpresas");
			
		}
		else {
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/view/formLogin.jsp");
			
			requestDispatcher.forward(request, response);
			
		}
	
	
	}

}
