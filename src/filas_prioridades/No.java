package filas_prioridades;

public class No {
	
	Carro valor;
	No proximo;
	int prioridade;
	
	public No(Carro valor, int prioridade) {
		this.valor = valor;
		this.prioridade = prioridade;
	}
	
	public No(String string, int prioridade2) {
		// fiz isso para desquebrar o código, obrigada!
	}

	@Override
	public String toString() {
		return valor + " ";
	}

}
