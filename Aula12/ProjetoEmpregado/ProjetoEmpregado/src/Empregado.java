
public abstract class Empregado {
	long matricula;
	String nome;
	
	public Empregado(long matricula, String nome) {
		super();
		this.matricula = matricula;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		String aux = "";
		aux += "Matrícula: " + matricula + "\n";
		aux += "Nome: " + nome + "\n";
		return aux;
	}
	
	public double calcularSalario() {
		return 0.0;
	}
	
}
