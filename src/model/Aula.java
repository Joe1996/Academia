package model;

import java.util.Date;

public class Aula {

	private long id;
	private String nomeAula;
	private String horaTreino;
	private Date data;
	private String atividadesRealizadas;
	private String alunosPresentes;
	private String convidadosTreino;
	private String modalidadeLuta;

	private Professor professor;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNomeAula() {
		return nomeAula;
	}

	public void setNomeAula(String nomeAula) {
		this.nomeAula = nomeAula;
	}

	public String getHoraTreino() {
		return horaTreino;
	}

	public void setHoraTreino(String horaTreino) {
		this.horaTreino = horaTreino;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getAtividadesRealizadas() {
		return atividadesRealizadas;
	}

	public void setAtividadesRealizadas(String atividadesRealizadas) {
		this.atividadesRealizadas = atividadesRealizadas;
	}

	public String getAlunosPresentes() {
		return alunosPresentes;
	}

	public void setAlunosPresentes(String alunosPresentes) {
		this.alunosPresentes = alunosPresentes;
	}

	public String getConvidadosTreino() {
		return convidadosTreino;
	}

	public void setConvidadosTreino(String convidadosTreino) {
		this.convidadosTreino = convidadosTreino;
	}

	public String getModalidadeLuta() {
		return modalidadeLuta;
	}

	public void setModalidadeLuta(String modalidadeLuta) {
		this.modalidadeLuta = modalidadeLuta;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
