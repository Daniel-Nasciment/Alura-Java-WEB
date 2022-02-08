package br.com.alura.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Não é a forma mais elegante de se fazer um logout
		// Mas a ideia é invalidar a sessão e destrui o coockie que contem o JSESSIONID
		// O mesmo é feito da seguinte forma
		
		HttpSession session = request.getSession();
		
		session.invalidate();
		
		response.sendRedirect("loginForm");
		

	}

}
