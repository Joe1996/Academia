package model.impl;

import java.util.Date;

public class Presenca {
	private long id;
	private Date dataHora;
	private long idAluno;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(long idAluno) {
		this.idAluno = idAluno;
	}

}
