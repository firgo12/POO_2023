package br.notaFiscal;
import java.util.ArrayList;
import java.util.List;

import br.produto.Produto;

public class NotaFiscal {
	
	private String nomeConsumidor;
	private List<Produto> listaProduto = new ArrayList<>();

	public NotaFiscal(String nomeConsumidor) {
		super();
		this.nomeConsumidor = nomeConsumidor;
	}

	public String getNomeConsumidor() {
		return nomeConsumidor;
	}


	@Override
	public String toString() {
		return "NotaFiscal [nomeConsumidor=" + nomeConsumidor + ", listaproduto=" + listaProduto + "]";
	}


	public void inserir(Produto produto) {
		listaProduto.add(produto);
	}
	
	public double calcularNF() {
		double valorTotal = 0;
		
		for (Produto produto : listaProduto) {
			valorTotal += produto.getPreco() * produto.getQtd();
		}
		
		return valorTotal;
	}
	
	

}
