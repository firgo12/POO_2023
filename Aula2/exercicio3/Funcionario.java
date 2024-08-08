package exercicio3;

public class Funcionario {
	
	// atributos ou propriedades ou variável de instância (= objeto)
	int id;
	String nome;
	double salarioBruto;
	
	//método para calcular e retornar o salário líquido
	public double calcularSalarioLiquido(double desconto) {
		double liquido;
		liquido = salarioBruto - (salarioBruto * desconto / 100);
		return liquido;
		//return salarioBruto * desconto;
	}
	
	//método para reajustar o valor do salário bruto
	public void calcularAumento(double aumento){
		salarioBruto = salarioBruto + (salarioBruto * aumento / 100);
	}
	
	//método para retornar todos os dados do funcionário
	public String getDados() {
		String aux = "";
		aux += "ID: " + id + "\n";
		aux += "Nome: " + nome + "\n";
		aux += "Salário Bruto R$: " + String.format("%.2f", salarioBruto)+ "\n";
		
		return aux;
	}
	
}
