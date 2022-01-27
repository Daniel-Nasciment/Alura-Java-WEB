package br.com.alura.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		System.out.println("Cadastrando nova empresa...");
	
		PrintWriter writer = response.getWriter();
		
		String parameter = request.getParameter("nome");
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Empresa " + parameter + " cadastrada!!</h1>");
		writer.println("</body>");
		writer.println("</html>");
		
	}

}
