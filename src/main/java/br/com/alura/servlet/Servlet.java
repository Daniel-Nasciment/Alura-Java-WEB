package br.com.alura.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.alura.modelo.Banco;
import br.com.alura.modelo.Empresa;


@WebServlet("/servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		List<Empresa> listaEmpresas = new Banco().listaEmpresas();
	
		
		String header = request.getHeader("accept");
		
		
		
		if(header.endsWith("/json")) {
			Gson gson = new Gson();
			
			String json = gson.toJson(listaEmpresas);
			
			response.setContentType("application/json");
			response.getWriter().print(json);
		}else {
			XStream xStream = new XStream();
			xStream.alias("empresa", Empresa.class);
			String xml = xStream.toXML(listaEmpresas);
			
			response.setContentType("application/xml");
			response.getWriter().print(xml);
		}
		
	
	}

}
