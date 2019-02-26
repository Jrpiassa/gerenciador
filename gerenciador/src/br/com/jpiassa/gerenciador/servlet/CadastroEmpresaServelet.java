package br.com.jpiassa.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastroEmpresaServelet
 */
@WebServlet("/novaEmpresa")
public class CadastroEmpresaServelet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2217568953665192970L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		out.println("<html>"
				+ "<body>"
				+ "<h1>Empresa "+ nome +" cadastrada com sucesso !</h1>"
				+ "</body>"
				+ "</html>");
	}

}
