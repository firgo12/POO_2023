
public class Paciente {

	// A PRIMEIRA coisa que devemos fazer antes de fazer um objeto é pensar nos
	// ATRIBUTOS que compõe o OBJETO

	// Criação de uma variavel (que irá representar o OBJETO, ou seja, irá falar
	// onde encontrar o objeto => endereço da memória) do tipo paciente, sendo que o
	// Paciente é uma classe
	// NEW (NOVO OBJETO) e chama um método para a criação de um objeto.
	// NEW istancia o endereço de memória da variavél
	// O metódo que vem logo em seguida do new, é o construtor, ou seja, é ele que
	// irá construir o objeto.
	// Por padrão as variaveis serão inicializados como 0 ou null

	// Atributo ou propriedades ou variável de instância (sinônimo de objeto =
	// instância)
	
	String nome;
	String cpf;
	double peso;
	double altura;
	
	//LEMBRE-SE QUE NO ORIENTAÇÃO A OBJETOS NÃO USAMOS STATIC!!!!!
	
	//Método para calcular e retornar o Imc 
	public double calcularImc() {
		double imc =0;
		
		imc = peso / (altura*altura);
		
		return imc;
	}
	
	
	//Método para calcular e retornar a situação do paciente
	//STRING nesse caso é uma classe
	public String verificarSituacao() {
		if (calcularImc() > 26) {
			return "Acima do peso";
		}
		return "Peso normal";
	}

	//método para retornar os dados de paciente
	public String getDados() {
		//Concatenar vazia
		String aux = "";
		aux += "Nome -->" + nome + "\n";
		aux += "CPF -->" + cpf + "\n";
		aux += "Peso (kg) -->" + peso + "\n";
		aux += "Altura(m) -->" + altura + "\n";
		
		return aux;
	}
}
