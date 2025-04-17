package desafio_lista;

public class ChamadaTriada {

	private Chamada chamada;
	private int severidade;
	private ChamadaTriada anterior;
	private ChamadaTriada proximo;

	public ChamadaTriada(Chamada chamada, int severidade) {
		setChamada(chamada);
		setSeveridade(severidade);
	}

	public Chamada getChamada() {
		return chamada;
	}

	public void setChamada(Chamada chamada) {
		this.chamada = chamada;
	}

	public int getSeveridade() {
		return severidade;
	}

	public void setSeveridade(int severidade) {
		this.severidade = severidade;
	}

	public ChamadaTriada getAnterior() {
		return anterior;
	}

	public void setAnterior(ChamadaTriada anterior) {
		this.anterior = anterior;
	}

	public ChamadaTriada getProximo() {
		return proximo;
	}

	public void setProximo(ChamadaTriada proximo) {
		this.proximo = proximo;
	}

}
