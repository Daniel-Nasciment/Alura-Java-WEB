package br.com.alura.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns = "/listaEmpresas")
public class MonitoramentoFilter implements Filter{

	// UM FILTER FICA ANTES DA CAMADA "CONTROLLER"
	// BASICAMENTE � UTILIZADO PARA N�O ESPALHAR RESPONSABILIDADES EM CLASSES QUE N�O DEVEM
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// LOGICA PARA MEDIR O TEMPO DE EXECU��O 
		
		long antes = System.currentTimeMillis();
		
		chain.doFilter(request, response);
		
		long depois = System.currentTimeMillis();
		
		
		System.out.println("O tempo foi de: " + (depois - antes));
		
		
	}

}
