
public class Main {
	public static void main(String[] args) {
		
		Paciente p = new Paciente();
		
		p.nome="Guilherme";
		p.cpf ="123.456";
		p.altura = 1.79;
		p.peso = 75.5;
		
		System.out.println(p.getDados());
		//Pego a classe e falo que quero usar o metodo calcularImc
		System.out.println(p.calcularImc());
		System.out.println(p.verificarSituacao());
		
	}
	
}
