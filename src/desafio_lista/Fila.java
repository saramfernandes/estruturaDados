package desafio_lista;

public class Fila {

	NoFila inicio;
	NoFila fim;
	
	public boolean isEmpty() {
		return inicio == null && fim == null;
	}
	
	public void enqueue(NoFila e) {
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
			String elemento = inicio.toString();
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
		NoFila aux = inicio;
		while (aux != null) {
			retorno += aux.toString() + " ";
			aux = aux.proximo;
		}
		return retorno;
	}
}
