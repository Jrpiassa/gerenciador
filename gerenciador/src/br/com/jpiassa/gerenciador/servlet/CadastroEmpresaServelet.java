package br.com.jpiassa.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jpiassa.gerenciador.model.Empresa;
import br.com.jpiassa.gerenciador.persistence.Banco;

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String nome = request.getParameter("nome");
		Banco banco = new Banco();
		Empresa empresa = new Empresa();
		empresa.setId(1L);
		empresa.setNome(nome);
		banco.adiciona(empresa);
		
		
		response.sendRedirect("listaEmpresa");
		
		//chama o jsp
		//RequestDispatcher requestDispatcher = request.getRequestDispatcher("/sucesso.jsp");
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listaEmpresa");
//		request.setAttribute("nomeEmpresa", empresa.getNome());
//		requestDispatcher.forward(request, response);
		/*
		 * out.println("<html>" + "<body>" + "<h1>Empresa "+ nome
		 * +" cadastrada com sucesso !</h1>" + "</body>" + "</html>");
		 */
	}

}
