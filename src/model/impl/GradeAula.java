package model.impl;

import java.util.Date;

public class GradeAula {

	private long id;
	private String nome;
	private Date horaInicio;
	private Date horaTermino;
	private int maximoAlunos;
	private String diasAula;
	private double valor;

	private Modalidade modalidade;
	private Professor professor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(Date horaTermino) {
		this.horaTermino = horaTermino;
	}

	public int getMaximoAlunos() {
		return maximoAlunos;
	}

	public void setMaximoAlunos(int maximoAlunos) {
		this.maximoAlunos = maximoAlunos;
	}

	public String getDiasAula() {
		return diasAula;
	}

	public void setDiasAula(String diasAula) {
		this.diasAula = diasAula;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Modalidade getModalidade() {
		return modalidade;
	}

	public void setModalidade(Modalidade modalidade) {
		this.modalidade = modalidade;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
