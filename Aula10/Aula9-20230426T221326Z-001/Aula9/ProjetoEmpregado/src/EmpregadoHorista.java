
public class EmpregadoHorista extends Empregado {

	int totalDeHorasTrabalhadas;
	double valorDaHoraTrabalhada;
	
	public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
		super(matricula, nome);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
	}
	
	public double calcularSalario() {
		return totalDeHorasTrabalhadas * valorDaHoraTrabalhada;
	} 
	
	@Override
	public String toString() {
		String aux = super.toString();
		aux += "Total de Horas Trabalhadas: "+ totalDeHorasTrabalhadas + "\n";
		aux += "Valor da hora trabalhada: "+ valorDaHoraTrabalhada + "\n";
		return aux;
	}
	
	
}
