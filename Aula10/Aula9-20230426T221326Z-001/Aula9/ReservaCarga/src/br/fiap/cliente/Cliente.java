package br.fiap.cliente;

public class Cliente {
	private int cnpj;
	private String cliente;
	
	//Source --> Generate Construtor with fields
	public Cliente(int cnpj, String cliente) {
		super();
		this.cnpj = cnpj;
		this.cliente = cliente;
	}
	
	//GET DADOS
	public String getDados() {
		String aux = "";
		aux += "CNPJ: "+ cnpj + "\n";
		aux += "Cliente: "+ cliente + "\n";
		
		return aux;
	}

	//Botão direito --> Source --> Generate getter and Setters
	
	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	

}
