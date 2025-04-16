package listas;

public class Lista {
	
	private Elemento primeiro;
	private Elemento ultimo;
	private int tamanho;	
	
	public Elemento getPrimeiro() {
		return primeiro;
	}

	public Elemento getUltimo() {
		return ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}


	private boolean isEmpty() {
		return tamanho == 0;
	}
	
	public void insereInicio(Elemento elemento) {
		if (isEmpty()) {
			primeiro = elemento;
			ultimo = elemento;
		}else {
			primeiro.setAnterior(elemento);
			elemento.setProximo(primeiro);
			primeiro = elemento;
		}
		tamanho ++;
	}
	
	public void insereFinal(Elemento elemento) {
		if (isEmpty()) {
			primeiro = elemento;
			ultimo = elemento;
		}else {
			ultimo.setProximo(elemento);
			elemento.setAnterior(ultimo);
			ultimo = elemento;
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
	
	public boolean buscar(Elemento elemento) {
		Elemento atual = primeiro;
		while (atual != null) {
			if (atual.getValor().equals(elemento.getValor())) {
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
		Elemento atual = primeiro;
		while (atual != null) {
			retorno += atual.getValor() + " ";
			atual = atual.getProximo();
		}
		return retorno.trim();
	}
}
