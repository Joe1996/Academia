package model.impl;

import model.Pessoa;

public class Gerente extends Pessoa {
	
	private String tempoGerencia;
	private double salario;

	public String getTempoGerencia() {
		return tempoGerencia;
	}

	public void setTempoGerencia(String tempoGerencia) {
		this.tempoGerencia = tempoGerencia;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
