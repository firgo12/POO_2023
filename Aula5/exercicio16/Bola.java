package exercicio16;

public class Bola {
	//variavel de instância
	String cor;
	double raio;
	
	public Bola(String cor, double raio) {
		//O THIS sabe o endereço do objeto criado.
		this.cor = cor;
		this.raio = raio;
	}

	public String retornarDados() {
		return cor + "\n" + raio;
	}

	public Bola maiorBola(Bola bola2, Bola bola3) {
		if (raio > bola2.raio && raio > bola3.raio) {
			return this;
		} else {
			if (bola2.raio > bola3.raio) {
				return bola2;
			} else {
				return bola3;
			}
		}
	}
}
