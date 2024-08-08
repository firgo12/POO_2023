package main;

import java.util.Scanner;

import descobrir.Descobrir;

public class Main {

	public static void main(String[] args) {
		// COnstrutor padrão sem nenhum parâmetro!!!!!!!
		
		//Encapsulamento ==> Agrupar todos os atributos e objetos em uma região da memória
		//Modificadores: "public(+)"; "private(-)"; "default" ou "pacote" 
		Descobrir d = new Descobrir();
		Scanner sc = new Scanner(System.in);
		int numero;
		
		do {
			System.out.print("Número --> ");
			numero = sc.nextInt();
			System.out.println(d.chutar(numero));
			
		} while (!d.chutar(numero).equalsIgnoreCase("acertou"));
		
		System.out.println("Tentativas --> "+d.getNumeroDeTentativas());
		
		
	}

}
