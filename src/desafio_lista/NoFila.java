package desafio_lista;

public class NoFila {

	Chamada chamada;
	ChamadaTriada chamadaTriada;
	NoFila proximo;
	
	public NoFila(Chamada chamada) {
		this.chamada = chamada;
	}
	
	public NoFila(ChamadaTriada chamadaTriada) {
		this.chamadaTriada = chamadaTriada;
	}
	
	@Override
	public String toString() {
		if (chamada != null) 
			return chamada.getSolicitante();
		else if (chamadaTriada != null) 
			return chamadaTriada.getChamada().getSolicitante();
		else 
			return "null";
	}
}
