
public class Main {

	public static void main(String[] args) {
		
		Empregado[] empregado = new Empregado[3];

		empregado[0] = new EmpregadoHorista(1, "Patricia", 200, 160);
		empregado[1] = new EmpregadoHorista(2, "Manoel", 100, 130);
		empregado[2] = new EmpregadoComissionado(3, "Selmini", 150000, 20);

		//imprime os dados dos empregados
		for (int i = 0; i < empregado.length; i++) {
			System.out.println(empregado[i]);
		}
		
		//imprimir o valor do salário de cada empregado
		for (Empregado e : empregado) {
			System.out.println(e.calcularSalario());
		}
		
	}

}
