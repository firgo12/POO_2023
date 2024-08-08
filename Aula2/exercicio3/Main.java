package exercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// O método é o construtor
		Funcionario f = new Funcionario();

		double aumento, desconto;

		// entrada de dados
		System.out.print("Nome ---> ");
		f.nome = entrada.nextLine();
		System.out.print("ID ---> ");
		f.id = entrada.nextInt();
		System.out.print("Salário bruto ---> R$ ");
		f.salarioBruto = entrada.nextDouble();

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
