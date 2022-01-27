package br.com.alura.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.modelo.Banco;
import br.com.alura.modelo.Empresa;

@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

		PrintWriter writer = response.getWriter();

		String parameter = request.getParameter("nome");

		Empresa empresa = new Empresa();
		empresa.setNome(parameter);

		Banco nuBank = new Banco();

		nuBank.adiciona(empresa);
		
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>Empresa " + parameter + " cadastrada!!</h1>");
		writer.println("</body>");
		writer.println("</html>");

	}

}
