package exercicio17;

public class Ponto {
	//Variável de instância
	int x;
	int y;
	
	// construtor
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
				
	}
	
	public Ponto() {
		// TODO Auto-generated constructor stub
	}

	//Método para retornar os dados
	public String getDados() {
		return "(" + x + ", "+ y + ")";
		
	}
	
	//Método para calcular e retornar a distância
	public double calcularDistancia(Ponto p) {
		double distancia;
		distancia = Math.sqrt(Math.pow(x - p.x, 2) + Math.pow(y - p.y, 2));
		return distancia;
	}
	
}
