package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Aluno[] aluno = new Aluno[2];
		//Criação de variavel para pegar os atributos do objeto Aluno
		int rm;
		String nome;
		double nota1, nota2;
		
		//Entrada de dados
		//Toda vez que declaramos um vetor o lenght é um atributo
		for (int i = 0; i < aluno.length; i++) {
			System.out.print("Nome: ");
			nome = teclado.nextLine();
			System.out.print("RM: ");
			rm = teclado.nextInt();
			System.out.print("Nota 1: ");
			nota1 = teclado.nextDouble();
			System.out.print("Nota 2: ");
			nota2 = teclado.nextDouble();
			
			System.out.println("");
			
			//Para limpar o ENTER que o nextLine PEGA
			teclado.nextLine();
			
			//Pular uma linha 
			System.out.print("");
			
			//Guardando os valores no objeto Aluno
			aluno[i] = new Aluno(rm, nome, nota1, nota2);
		}
		
		//Saída de dados
		//for (int i = 0; i < aluno.length; i++) {
			//System.out.println(aluno[i].getDados());
		//}
		
		//For que não tem controle de posição, além de servir apenas para exibir os dados de um VETOR, 
		//SOMENTE O VETOR
		//Colocar como parametro o tipo do Array e faz uma declaração de uma variavel, 
		//depois dos dois pontos, colocar o nome do array
		// a variavel declarada, é para pegar o objeto Aluno e depois incrementa para pegar o próximo 
		
		System.out.println("Antes da ordenação");
		for(Aluno a : aluno) {
			System.out.println(a.getDados());
		}
		
		ordenar(aluno);
		
		System.out.println("Depois da ordenação");
		for(Aluno a : aluno) {
			System.out.println(a.getDados());
		}
		
		teclado.close();
	}

	public static void ordenar(Aluno[] aluno) {
		Aluno aux;
		
		for (int j = 0; j < aluno.length; j++) {
			for (int i = 0; i < (aluno.length - 1); i++) {
				if(aluno[i].calcularMedia() < aluno[i+1].calcularMedia()) {
					aux = aluno[i];
					aluno[i] = aluno[i+1];
					aluno[i+1] = aux;
				}
			}
		}
	}

	

}
