package br.produto;

public class Produto {
	
	private int id;
	private String nome;
	private double preco;
	private int qtd;
	
	public Produto(int id, String nome, double preco, int qtd) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", preco=" + preco + ", qtd=" + qtd + "]";
	}
	
	

}
