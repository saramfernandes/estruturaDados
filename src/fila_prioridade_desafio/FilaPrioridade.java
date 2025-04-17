package fila_prioridade_desafio;

public class FilaPrioridade {
	No inicio;
	No fim;
	
	boolean isEmpty() {
		return inicio == null && fim == null;
	}
	
	void enqueue(No e) {
		if (isEmpty()) {
			inicio = e;
			fim = e;
		}else {
			if(e.prioridade > inicio.prioridade) {
				e.proximo = inicio;
				inicio = e;
			}else {
				if (e.prioridade <= fim.prioridade) {
					fim.proximo = e;
					fim = e;
				}else {
					No aux = inicio;
					while(aux.proximo != null && aux.proximo.prioridade >= e.prioridade) {
						aux = aux.proximo;
					}
					e.proximo = aux.proximo;
					aux.proximo = e;
				}
			}
		}
	}
	
	String view() {
		String retorno = "";
		No aux = inicio;
		while (aux != null) {
			retorno += aux.valor + " ";
			aux = aux.proximo;
		}
		return retorno;
	}
	
}
