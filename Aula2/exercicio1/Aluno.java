package exercicio1;

public class Aluno {

	// atributos ou propriedades ou variável de instância (= objeto)
	int rm;
	String nome;
	double nota1;
	double nota2;

	// método para calcular e retornar a média. LEMBRE-SE não precisa falar os
	// atributos no método e declarar o static
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
}
