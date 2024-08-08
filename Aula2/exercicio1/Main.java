package exercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		aluno.nome = "Guilherme";
		aluno.rm = 95173;
		aluno.nota1 = 9;
		aluno.nota2 = 10;
		
		//System.out.print("Insere o nome do aluno: ");
		//aluno.nome = entrada.next();
		
		entrada.close();
		
		System.out.println(aluno.calcularMedia());
		System.out.println(aluno.situacaoAluno());

	}

}
