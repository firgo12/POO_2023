package exercicio.conta;

import exercicio.excecao.ContaExcecao;

public class ContaBancaria {

	private double saldo;
	private double limite;
	
	public ContaBancaria(double saldo, double limite) {
		super();
		this.saldo = saldo;
		this.limite = limite;
	}

	public double getSaldoLimite() {
		return saldo + limite;
	}
	
	//throw == Cria e lança um objeto
	//throws == Esse metódo internamente pode ocorrer uma exceção, logo vai jogar para quem chamou o método.
	public boolean sacar(double valor) throws ContaExcecao {
		if(valor >= 500 || getSaldoLimite() <= 0) {
			throw new ContaExcecao("Valor de saque não permetido!");
		}
		saldo -= valor;
		return true;
	}
	
	public boolean depositar(double valor) throws ContaExcecao {
		if(valor > 1000) {
			throw new ContaExcecao();
		}
		saldo += valor;
		return true;
	}
	
}
