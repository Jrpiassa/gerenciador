package br.com.jpiassa.gerenciador.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.jpiassa.gerenciador.model.Empresa;
import br.com.jpiassa.gerenciador.persistence.Banco;

/**
 * Servlet implementation class AlteraEmpresaServlet
 */
@WebServlet("/alteraEmpresa")
public class AlteraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nomeEmpresa = request.getParameter("nome");
	        String paramDataEmpresa = request.getParameter("dataAbertura");
	        String paramId = request.getParameter("id");
	        Integer id = Integer.valueOf(paramId);

	        Date dataAbertura = null;
	        try {
	            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	            dataAbertura = sdf.parse(paramDataEmpresa);
	        } catch (ParseException e) {
	            throw new ServletException(e);
	        }
	        Banco banco = new Banco();
	        Empresa empresa = banco.findById(id);
	        empresa.setNome(nomeEmpresa);
	        empresa.setDataAbertura(dataAbertura);

	        response.sendRedirect("listaEmpresa");
	}

}
