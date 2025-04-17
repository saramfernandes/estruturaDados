package desafio_lista;

public class NoFila {

	Chamada valor;
	NoFila proximo;
	
	public NoFila(Chamada valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return valor.getSolicitante();
	}
}
