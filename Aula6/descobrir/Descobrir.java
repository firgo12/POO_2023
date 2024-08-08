package descobrir;

import java.util.Random;

public class Descobrir {
	///Variáveis de instância
	private int numeroSecreto;
	private int numeroDeTentativa;
	
	//construtor
	public Descobrir() {
		Random gerador = new Random();
		this.numeroSecreto = gerador.nextInt(1001);
	}
	
	//Método para verificar se o usuário
	public String chutar(int num) {
		if (num == numeroSecreto) {
			return "ACERTOU";
		} else {
			numeroDeTentativa++;
			if (numeroSecreto > num) {
				return "ACIMA";
			} 
			return "ABAIXO";
			
		}
	
	}
	
	//Método para retornar os números de tentativas
	public int getNumeroDeTentativas() {
		return this.numeroDeTentativa;
	}
}
