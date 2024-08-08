package br.fiap.cilindro;

import br.fiap.forma.Forma;
import br.fiap.volume.Volume;

public class Cilindro extends Forma implements Volume {
	
	private double altura;

	public Cilindro(int cx, int cy, double raio, double altura) {
		super(cx, cy, raio);
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		return 2 * Math.PI * raio * (raio + altura);
	}
	
	@Override
	public String toString() {
		return "Cilindro [cx=" + cx + ", cy=" + cy + ", raio=" + raio + ", altura=" + altura + "]";
	}

	public double calcularVolume() {
		return Math.PI * raio * raio * altura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	
	
}
