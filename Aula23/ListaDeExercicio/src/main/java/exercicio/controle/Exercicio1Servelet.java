package exercicio.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exercicio.entidade.Cliente;

/**
 * Servlet implementation class Exercicio1Servelet
 */
@WebServlet("/ex1")
public class Exercicio1Servelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exercicio1Servelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Pega o 'name' do HTML
		String nome = request.getParameter("nome");
		int diaria = Integer.parseInt(request.getParameter("diaria"));
		
		Cliente cliente = new Cliente(nome, diaria);
		
		double conta, taxa;
		if (diaria > 15) {
			taxa = 15.50;
		} else if(diaria == 15) {
			taxa = 36;
		} else {
			taxa = 58;
		}
		
		conta = (250 + taxa) * diaria;
		
		//Sessão, seria uma opão segura do Cookie, ou seja, naquele tempo de sessão, a sessão existe! Não precisando fazer um dispatcher
		HttpSession session = request.getSession();
		
		session.setAttribute("cliente", cliente);
		
		//Você nomeia e fala o que vai receber
		request.setAttribute("conta", conta);
		//Dispatcher (browser para o server ou inverso) manda dados para um lugar para o outro
		RequestDispatcher dispatcher = request.getRequestDispatcher("form/formResultadoExercicio1.jsp");
		dispatcher.forward(request, response);
	}

}
