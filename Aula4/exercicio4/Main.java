package exercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Livro l = new Livro();
		l.id = 123;
		l.titulo = "Aventuras mo mundo Java";
		l.autor = "Mauro Parducci Ismael";
		l.disponivel = true;
		
		System.out.println(l.getDados());
		
		l.devolverLivro();
		
		System.out.println(l.getDados());
		
		l.emprestarLivro();
		
		System.out.println(l.getDados());
		
		teclado.close();

	}
	
	

}
