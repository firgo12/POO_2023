package br.main;

import br.notaFiscal.NotaFiscal;
import br.produto.Produto;

public class Main {
	public static void main(String[] args) {
		
		NotaFiscal nf = new NotaFiscal("Antonio");
		Produto produto;
		
		// 1º produto
		produto = new Produto (1, "arroz", 10, 10);
		nf.inserir(produto);
		
		// 2° produto
		produto = new Produto (2, "feijão", 5, 20);
		nf.inserir(produto);
		
		System.out.println(nf.getNomeConsumidor());
		System.out.println(nf.calcularNF());
	}
	
}
