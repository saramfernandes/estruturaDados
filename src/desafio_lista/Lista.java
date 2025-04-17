package desafio_lista;

public class Lista {

	private ChamadaTriada primeiro;
	private ChamadaTriada ultimo;
	private int tamanho;	
	
	public ChamadaTriada getPrimeiro() {
		return primeiro;
	}

	public ChamadaTriada getUltimo() {
		return ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}


	private boolean isEmpty() {
		return tamanho == 0;
	}
	
	public void insereInicio(ChamadaTriada chamadaTriada) {
		if (isEmpty()) {
			primeiro = chamadaTriada;
			ultimo = chamadaTriada;
		}else {
			primeiro.setAnterior(chamadaTriada);
			chamadaTriada.setProximo(primeiro);
			primeiro = chamadaTriada;
		}
		tamanho ++;
	}
	
	public void insereFinal(ChamadaTriada chamadaTriada) {
		if (isEmpty()) {
			primeiro = chamadaTriada;
			ultimo = chamadaTriada;
		}else {
			ultimo.setProximo(chamadaTriada);
			chamadaTriada.setAnterior(ultimo);
			ultimo = chamadaTriada;
		}
		tamanho ++;	
	}
	
	public void insereMeio(ChamadaTriada chamadaTriada, int posicao) {
		if (isEmpty()) {
			primeiro = chamadaTriada;
			ultimo = chamadaTriada;
		}else {
			if (posicao > tamanho) {	
				ChamadaTriada aux = primeiro;
				for (int i = 0; i < posicao && i < tamanho; i ++) {
					aux = aux.getProximo();
				}
				aux.getAnterior().setProximo(chamadaTriada);
				chamadaTriada.setProximo(aux);
				chamadaTriada.setAnterior(aux.getAnterior());
				aux.setAnterior(chamadaTriada);	
			}
		}
		tamanho ++;
	}

	public void removeInicio() {
		if (!isEmpty()) {
			if (tamanho == 1) {
				primeiro = null;
				ultimo = null;
			}else {
				primeiro.getProximo().setAnterior(null);
				primeiro = primeiro.getProximo();
			}
			tamanho --;
		}
	}
	
	public void removeFinal() {
		if (!isEmpty()) {
			if (tamanho == 1) {
				primeiro = null;
				ultimo = null;
			}else {
				ultimo.getAnterior().setProximo(null);
				ultimo = ultimo.getAnterior();
			}
			tamanho --;
		}
	}
	
	public boolean buscar(ChamadaTriada chamadaTriada) {
		ChamadaTriada atual = primeiro;
		while (atual != null) {
			if (atual.getChamada().equals(chamadaTriada.getChamada())) {
				return true;
			}
			atual = atual.getProximo();
		}
		return false;
	}
	
	public String view() {
		if(isEmpty()) {
			return "Lista vazia";
		}
		String retorno = "";
		ChamadaTriada atual = primeiro;
		while (atual != null) {
			retorno += atual.getChamada() + " " + atual.getSeveridade() + "\n";
			atual = atual.getProximo();
		}
		return retorno.trim();
	}
}
