package br.com.jpiassa.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/hello")
public class HelloWorldServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3494675964188564415L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Curso Servelet - 01</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Hello World com Servlet</h1>");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("finalizando o servlet hello world !");
		
	}

}
