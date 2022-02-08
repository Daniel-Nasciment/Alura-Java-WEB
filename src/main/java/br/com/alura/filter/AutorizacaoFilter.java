package br.com.alura.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * @author Daniel
 * 
 * Como n�o centralizei a entrada com um controller principal muitos c�digos tiveram que usar do CRTL + C - CRTL + V
 * A ideia � entender por debaixo dos panos como os servlets funcionam e entender conceitos importantes
 * Dessa forma o foco n�o � de se aprofundar nas boas praticas e padr�es de projeto
 *
 */

@WebFilter("/listaEmpresas")
public class AutorizacaoFilter implements Filter {


	public void doFilter(ServletRequest requestServlet, ServletResponse responseServlet, FilterChain chain) throws IOException, ServletException {
		
		// Como ServletRequest e ServletResponse s�o mais gen�ricos, � necess�rio fazer um cast
		
		HttpServletRequest request = (HttpServletRequest) requestServlet;
		
		HttpServletResponse response = (HttpServletResponse) responseServlet;
		
		HttpSession session = request.getSession();
		
		
		if (session.getAttribute("usuarioLogado") == null) {
			response.sendRedirect("loginForm");
			return;
		}
		
		chain.doFilter(request, response);
	}


}
