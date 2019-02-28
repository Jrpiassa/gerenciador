package br.com.jpiassa.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jpiassa.gerenciador.persistence.Banco;

/**
 * Servlet implementation class ListaEmpresa
 */
@WebServlet("/listaEmpresa")
public class ListaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html>");
//		out.println("<body>");
//		out.println("<ul>");
		Banco banco = new Banco();
//		for (Empresa emp : banco.listaEmpresa()) {
//			out.println("<li>"+ emp.getNome()+"</li>");
//		} 
//		out.println("</ul>");
//		out.println("</body>");
//		out.println("</html>");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listaEmpresas.jsp");
		request.setAttribute("listaEmpresas", banco.listaEmpresa());
		requestDispatcher.forward(request, response);
		
	}

}
