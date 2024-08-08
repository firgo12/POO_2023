package exercicio17;

public class Main {

	public static void main(String[] args) {
		Ponto p0 = new Ponto();
		Ponto p1 = new Ponto(10, 10);
		Ponto p2 = new Ponto(20, 30);
		Ponto p3 = new Ponto(10, 40);
		Ponto p4 = new Ponto (30, 30);
		
		System.out.println(p1.getDados());
		System.out.println(p2.getDados());
		System.out.println(p3.getDados());
		System.out.println(p4.getDados());
		
		System.out.println("A distancia em relacao do ponto (0,0) e: " + p1.calcularDistancia(p0));
		
		System.out.println(p0.getDados());

		
	}

}
