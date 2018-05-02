package vo;

public class Modalidade {
	protected long id;
	protected String nome;
	protected String nomeMestre;

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

	public String getNomeMestre() {
		return nomeMestre;
	}

	public void setNomeMestre(String nomeMestre) {
		this.nomeMestre = nomeMestre;
	}
}
