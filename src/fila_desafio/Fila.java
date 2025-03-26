package fila_desafio;

public class Fila {
	No inicio;
	No fim;
	
	public boolean isEmpty() {
		return inicio == null && fim == null;
	}
	
	public void enqueue(No e) {
		if (isEmpty()) {
			inicio = e;
			fim = e;
		}else {
			fim.proximo = e;
			fim = e;
		}
	}
	
	public String dequeue() {
		if(!isEmpty()) {
			String elemento = inicio.nome;
			inicio = inicio.proximo;
			if (inicio == null) {
				fim = null;
			}
			return elemento;
		}
		return null;
	}
	
	public String view() {
		String retorno = "";
		No aux = inicio;
		while (aux != null) {
			retorno += aux.nome + " ";
			aux = aux.proximo;
		}
		return retorno;
	}
}
