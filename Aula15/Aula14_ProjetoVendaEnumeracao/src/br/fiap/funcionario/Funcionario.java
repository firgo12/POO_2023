package br.fiap.funcionario;

import br.fiap.cargo.Cargo;

public class Funcionario {
	private String nome;
	private double salario;
	private Cargo cargo;
	
	public Funcionario(String nome, double salario, Cargo cargo) {
		super();
		this.nome = nome;
		this.salario = salario;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}
