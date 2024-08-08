
public class EmpregadoHorista extends Empregado {
	int totalDeHorasTrabalhadas;
	double valorHoraTrabalhada;
	
	public EmpregadoHorista(long matricula, String nome, int totalDeHorasTrabalhadas, double valorHoraTrabalhada) {
		super(matricula, nome);
		this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
		this.valorHoraTrabalhada = valorHoraTrabalhada;
	}
	
	@Override
	public double calcularSalario() {
		return totalDeHorasTrabalhadas * valorHoraTrabalhada;
	}
	
}
