package filas_prioridades;

public class No {
	
	Carro valor;
	No proximo;
	int prioridade;
	
	public No(Carro valor, int prioridade) {
		this.valor = valor;
		this.prioridade = prioridade;
	}
	
	@Override
	public String toString() {
		return valor + " ";
	}

}
