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


@WebServlet("/xml")
public class XmlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
		List<Empresa> listaEmpresas = new Banco().listaEmpresas();
	
		XStream xStream = new XStream();
		// ESSE CARA AO EM VEZ DE DEVEOLVER O NOME DO PACOTE, TRAZ O NOME QUE EU DEFINIR
		xStream.alias("empresa", Empresa.class);
		String xml = xStream.toXML(listaEmpresas);
		
		response.setContentType("application/xml");
		// DEVOLVE PARA O CHAMADOR
		response.getWriter().print(xml);;
		
	
	}

}
