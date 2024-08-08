package exercicio6;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Bilhete b1 = new Bilhete();
		Random gerador = new Random();
		b1.numero = gerador.nextInt(50000);
		b1.nome = "Selmini Jr.";
		
		//Vale lembrar que como tarifa e o método aumentarTarifa são estáticos
		//quando queremos mudar o valor dela, colocamos o nome da CLASSE.ATRIBUTO ou CLASSE.MÉTODO
		System.out.println("tarifa = R$ " + Bilhete.tarifa);
		
		b1.carregar(50);
		b1.passarNaCatraca();
		b1.passarNaCatraca();

		System.out.println("Saldo = R$ "+ b1.getSaldo());
		
		Bilhete.aumentarTarifa(20);
		b1.passarNaCatraca();
		b1.passarNaCatraca();
		
		System.out.println("Saldo = R$ "+ b1.getSaldo());
	}

}
