package desafio_lista;

import java.time.LocalDateTime;

public class ChamadaHistorico {
	
	private ChamadaTriada chamada;
	private LocalDateTime data;
	private ChamadaHistorico anterior;
	
	public ChamadaHistorico(ChamadaTriada chamada, LocalDateTime data) {
		setChamada(chamada);
		setData(data);
	}
	
	@Override
	public String toString() {
		return chamada + " (" + data + ")";
	}
	
	public ChamadaTriada getChamada() {
		return chamada;
	}
	
	public void setChamada(ChamadaTriada chamada) {
		this.chamada = chamada;
	}
	
	public LocalDateTime getData() {
		return data;
	}
	
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	
	public ChamadaHistorico getAnterior() {
		return anterior;
	}
	
	public void setAnterior(ChamadaHistorico anterior) {
		this.anterior = anterior;
	}
	
	
	

}
