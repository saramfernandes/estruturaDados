package filas_prioridades;

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
	
	String dequeue() {
		if (isEmpty()) {
			String elemento = inicio.valor.toString();
			inicio = inicio.proximo;
			if(inicio == null)
				fim = null;
			return elemento;
		}
		return null;
	}
	
	String view() {
		String retorno = "";
		No aux = inicio;
		while (aux != null) {
			retorno += aux.valor.toString() + " ";
			aux = aux.proximo;
		}
		return retorno;
	}
	
}
