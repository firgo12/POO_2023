package br.fiap.circulo;

import br.fiap.forma.Forma;

public class Circulo extends Forma {

	public Circulo(int coordenadaX, int coordenadaY, double raio) {
		super(coordenadaX, coordenadaY, raio);
	}

	@Override
	public double calcularArea() {
		return Math.PI * raio * raio;
	}

	@Override
	public String toString() {
		return "Circulo [cx=" + cx + ", cy=" + cy + ", raio=" + raio + "]";
	}
	
	
}
