//Temos costume de gerar uma SUPER CLASSE com abstract, pois ela não é usada para gerar um objeto
public abstract class Empregado {
	long matricula;
	String nome;
	
	public Empregado(long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	
	//O eclipse fex uma anotação, para sinalizar que está ocorrendo uma sobreposição
	@Override
	public String toString() {
		String aux = "";
		aux += "Matrícula: " + matricula + "\n";
		aux += "Nome: " + nome + "\n";
		return aux;
		
	}
	
	//Quando usamos o Abstract, significa que não tem um corpo, ou seja, código!!!
	public abstract double calcularSalario();
	
}
