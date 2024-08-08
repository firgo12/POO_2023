package exercicio.main;

import exercicio.conta.ContaBancaria;
import exercicio.excecao.ContaExcecao;

public class Main {

	public static void main(String[] args) {
	
		ContaBancaria cb = new ContaBancaria(500, 1000);
		
		try {
			//cb.sacar(650);
			cb.depositar(1200);
		} catch (ContaExcecao e) {
			e.printStackTrace();
			//System.out.println(e);
		}
		finally {
			System.out.println("Estou no finally");
		}
		
	}

}
