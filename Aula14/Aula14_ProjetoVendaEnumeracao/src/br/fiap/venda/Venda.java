package br.fiap.venda;

import br.fiap.cargo.Cargo;
import br.fiap.funcionario.Funcionario;

public class Venda {
	private Funcionario funcionario;
	private double venda;
	
	public Venda(Funcionario funcionario, double venda) {
		super();
		this.funcionario = funcionario;
		this.venda = venda;
	}
	
	public double calcularComissao() {
		double comissao = 0;
		Cargo cargo = funcionario.getCargo();
		
		if(cargo.equals(Cargo.ATENDENTE)) {
			comissao = venda * 10 / 100;
		} else if (cargo.equals(Cargo.VENDEDOR)) {
			comissao = (venda * 15 / 100) + 5;
		} else if (cargo.equals(Cargo.GERENTE)) {
			comissao = (venda * 20 / 100) + 10;
		}
		
		return comissao;
	}

	
}
