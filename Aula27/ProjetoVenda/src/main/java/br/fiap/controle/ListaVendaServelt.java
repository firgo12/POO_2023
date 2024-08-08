package br.fiap.controle;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.dao.VendaDAO;
import br.fiap.entidade.Venda;

/**
 * Servlet implementation class ListaVendaServelt
 */
@WebServlet("/listaVenda")
public class ListaVendaServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListaVendaServelt() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		VendaDAO dao = new VendaDAO();
		List<Venda> lista = dao.listar();
		request.setAttribute("lista", lista);
	}

}
