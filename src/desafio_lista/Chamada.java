package desafio_lista;

public class Chamada {

	private String solicitante;
	private String descricao;
	
	public Chamada(String solicitante, String descricao) {
		setSolicitante(solicitante);
		setDescricao(descricao);
	}
	
	public String getSolicitante() {
		return solicitante;
	}
	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@Override
	public String toString() {
		return solicitante;
	}
	
}
