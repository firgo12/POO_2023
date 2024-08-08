package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {

	private double capacidade;
	private int index;
	private Carga carga[];
	
	public Viagem() {
		this.capacidade = 10000;
		this.index = 0;
		this.carga = new Carga [20];
	}
	
	 //método para reservar uma carga na viagem
	 public boolean reservar(Carga carga) {
		 if(permitidoReservar(carga.getPeso())) {//SE retornar TRUE...
			 this.carga[index++] = carga; //USA A CARIAVEL INDEX E DEPOIS SOMA 1
			 return true;
		 }
		 
		 return false;
	 }
	
	 //método para retornar a capacidade total já reservada
	 public double capacidadeReservada() {
		 double total = 0;
		 for (int i = 0; i < index; i++) {
			total += carga[i].getPeso();
		 }
		 return total;
	 }
	 
	 //Método para verificar se é possível fazer um reserva
	 public boolean permitidoReservar(double peso) {
		 if(index < carga.length && capacidadeReservada() + peso <= capacidade) {
			 return true;
		 }
		 return false;
	 }
	 
	 //Método para retornar os dados de todas as cargas reservadas
	 public String getDados() {
		 String aux = "";
		 for(int i = 0; i < index; i++) {
			 aux += carga[i].getDados() + "\n";
		 }
		 return aux;
	 }

	 //método para retornar os dados de uma carga especifica
	 public String getDados(int posicao) {
		return carga[posicao].getDados();

	} 
	
	 //método para pesquisar uma carga pelo cnpj do cliente
	 // método vai retornar -1 ou posição do vetor
	 public int pesquisar(int cnpj) {
		 int posicao = -1;
		 for (int i = 0; i < index; i++) {
			if(carga[i].getCliente().getCnpj() == cnpj) {
				posicao = i;
			}
		 }
		 return posicao;
	 }

	 //Método para excluir uma carga de uma posição do vetor
	 public boolean cancelar(int posicao) {
		
		
	 }
	 
	 
}
