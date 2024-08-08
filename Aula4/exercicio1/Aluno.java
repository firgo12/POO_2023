package exercicio1;

public class Aluno {

	// atributos ou propriedades ou variável de instância (= objeto)
	int rm;
	String nome;
	double nota1;
	double nota2;

	// método para calcular e retornar a média. LEMBRE-SE não precisa falar os
	// atributos no método e declarar o static
	
	//Construtor 
	public Aluno(int rm, String nome, double nota1, double nota2) {
		//Coloca o THIS para falar que eu quero pegar a variavel de fora! O THIS é uma referência a objeto que está sendo criado
		this.rm = rm;
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}
	
	//Evitar colocar Scanner no método 
	public double calcularMedia() {
		double media = 0;

		media = (nota1 + nota2) / 2;

		return media;
		// return (nota1 + nota2) /2;
	}

	// método para retornar a situação do aluno
	public String situacaoAluno() {

		if (calcularMedia() >= 6) {
			return "APROVADO";
		}

		return "REPROVADO";
	}
	
	//Método para retornar os dados
	public String getDados(){
		String aux = "";
		aux += "Nome: " + nome + "\n";
		aux += "Média: "+ String.format("%.2f", calcularMedia()) + "\n";
		aux += "Situação: "+ situacaoAluno()+"\n";
		
		return aux;
	}
	
}
