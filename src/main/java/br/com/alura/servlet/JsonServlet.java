package br.com.alura.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import br.com.alura.modelo.Banco;
import br.com.alura.modelo.Empresa;


@WebServlet("/json")
public class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		List<Empresa> listaEmpresas = new Banco().listaEmpresas();
	
		Gson gson = new Gson();
		
		String json = gson.toJson(listaEmpresas);
		
		response.setContentType("application/json");
		// DEVOLVE PARA O CHAMADOR
		response.getWriter().print(json);;
		
	
	}

}
