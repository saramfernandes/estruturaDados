package fila_prioridade_desafio;

public class No {
	String valor;
	No proximo;
	int prioridade;
	
	public No(String valor, int prioridade) {
		this.valor = valor;
		this.prioridade = prioridade;
	}
	
	@Override
	public String toString() {
		return valor + " ";
	}
}
