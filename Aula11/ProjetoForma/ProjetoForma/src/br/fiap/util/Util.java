package br.fiap.util;
import static javax.swing.JOptionPane.*;

import br.fiap.cilindro.Cilindro;
import br.fiap.circulo.Circulo;
import br.fiap.forma.Forma;
import br.fiap.volume.Volume;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;


public class Util {

	
	private Forma[] forma = new Forma[10];
	private int index;
	
	public void menu() {
		int opcao;
		
		do {
			opcao = parseInt(showInputDialog(gerarMenu()));
			if(opcao < 1 || opcao > 6) {
				showMessageDialog(null, "Opção inválida");
			} else {
				switch(opcao) {
					case 1: 
					case 2:
						gerar(opcao);
						break;
					case 3:
						imprimirDados(); 
						break;
					case 4:
						imprimirArea();
						break;
					case 5:
						imprimirVolume();
						break;
				}
			}
		} while(opcao != 6);
	}
	


	private void imprimirVolume() {
		String aux = "";
		Cilindro cilindro;
		
		for (int i = 0; i < index; i++) {
			if(forma[i] instanceof Volume) {
				cilindro = (Cilindro) forma[i];
				aux +="Cilindro volume = " + cilindro.calcularVolume() + "\n";
			}
		}
		showMessageDialog(null, aux);
	}



	private void imprimirArea() {
		String aux = "";
		String classe = "";
		for (int i = 0; i < index; i++) {
			//Se esse objeto "nasceu" no Cilindro
			if (forma[i] instanceof Cilindro) {
				classe = "Cilindro";
			} else {
				classe = "Circulo";
			}
			
			aux += classe + " area = " + forma[i].calcularArea() + "\n"; ;
		}
		showMessageDialog(null, aux);
	}


	private void imprimirDados() {
		String aux = "";
		for (int i = 0; i < index; i++) {
			aux += forma[i] + "\n";
		}
		showMessageDialog(null, aux);
	}



	private void gerar(int opcao) {
		int cx, cy;
		double raio, altura;
		
		cx  = parseInt(showInputDialog("Coordenada X"));
		cy  = parseInt(showInputDialog("Coordenada Y"));
		raio  = parseDouble(showInputDialog("Raio"));
		
		if (opcao == 1) {
			forma[index] = new Circulo(cx, cy, raio);
		} else {
			altura  = parseDouble(showInputDialog("Altura"));
			forma[index] = new Cilindro(cx, cy, raio, altura);
		}
		index++;
	}



	private String gerarMenu() {
		String aux = "Escolha uma opção\n";
		
		aux += "1. Gerar círculo\n";
		aux += "2. Gerar cilindro\n";
		aux += "3. Imprimir dados\n";
		aux += "4. Imprimir áreas\n";
		aux += "5. Imprimir volumes\n";
		aux += "6. Encerrar\n";
		return aux;
	}
}
