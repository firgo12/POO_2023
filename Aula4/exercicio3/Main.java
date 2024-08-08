package exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double aumento, desconto;
		int id;
		String nome;
		double salario;
		
		// entrada de dados
		System.out.print("Nome ---> ");
		nome = entrada.nextLine();
		System.out.print("ID ---> ");
		id = entrada.nextInt();
		System.out.print("Salário bruto ---> R$ ");
		salario = entrada.nextDouble();
		
		Funcionario f = new Funcionario(id, nome, salario);

		// impressão dos dados
		System.out.println();
		System.out.println(f.getDados());

		// entrada da porcentagem de aumento
		System.out.println();
		System.out.print("Porcentagem de aumento ---> ");
		aumento = entrada.nextDouble();
		f.calcularAumento(aumento);

		// impressão dos dados com o aumento
		System.out.println();
		System.out.println(f.getDados());
		
		//entrada da porcentagem de desconto
		System.out.println();
		System.out.print("Porcentagem de desconto ---> ");
		desconto = entrada.nextDouble();
		System.out.println("Salário líquido R$ " + f.calcularSalarioLiquido(desconto));
		
		entrada.close();
	}

}
