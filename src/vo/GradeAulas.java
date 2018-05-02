package vo;

public class GradeAulas {
	protected long id;
	protected String nome;
	protected String graduacao;
	protected String proximaGraduacao;

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

	public String getGraduacao() {
		return graduacao;
	}

	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}

	public String getProximaGraduacao() {
		return proximaGraduacao;
	}

	public void setProximaGraduacao(String proximaGraduacao) {
		this.proximaGraduacao = proximaGraduacao;
	}

}
