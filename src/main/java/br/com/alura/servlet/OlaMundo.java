package br.com.alura.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/olaMundo")
public class OlaMundo extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		PrintWriter writer = res.getWriter();
	
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Ola Mundo, meu primeiro servlet!</h1>");
		writer.println("</body>");
		writer.println("</html>");
		
		System.out.println("O servlet foi chamado!!");
		
	}

}
