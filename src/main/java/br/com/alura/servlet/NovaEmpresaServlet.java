package br.com.alura.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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

		String nome = request.getParameter("nome");
		String data = request.getParameter("data");

		Date dataFormatada = null;

		try {

			// FORMATADOR DE DATA DO TIPO 'DATE'
			SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
			dataFormatada = formatador.parse(data);

		} catch (ParseException e) {

			throw new ServletException(e);

		}

		Empresa empresa = new Empresa();
		empresa.setNome(nome);
		empresa.setData(dataFormatada);

		Banco nuBank = new Banco();

		nuBank.adiciona(empresa);

		// REDIRECIONANDO PARA OUTRO SERVLET
		response.sendRedirect("listaEmpresas");
	}

}
