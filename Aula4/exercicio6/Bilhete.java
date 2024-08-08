package exercicio6;

public class Bilhete {

	int numero;
	String nome;
	double saldo;
	static double tarifa = 4.40;
	
	//método para retornar o saldo
	public double getSaldo() {
		return saldo;
	}
	
	//método para carregar 
	public void carregar(double valor){
		saldo += valor;
	}
	
	//método para passar na catraca
	public void passarNaCatraca() {
		saldo -= tarifa;
	}
	
	//método para aumentar o valor da tarifa
	public static void aumentarTarifa(double porcentagem) {
		tarifa += tarifa * porcentagem/ 100;
	}
	
}
