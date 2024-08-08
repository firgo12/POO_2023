//Quando queremos colocar uma herança, colocamos na classe o extends para falar
//que vai herdar atributos de uma SUPERCLASSE
public class EmpregadoComissionado extends Empregado{

	double totalDeVendas;
	double comissao;
	
	public EmpregadoComissionado(long matricula, String nome, double totalDeVendas, double comissao) {
		//super está chamando o construtor da SUPER CLASSE!!
		super(matricula, nome);
		this.totalDeVendas = totalDeVendas;
		this.comissao = comissao;
	}
	
	@Override
	public double calcularSalario() {
		return (totalDeVendas * comissao)/100;
	}
	
	
}
