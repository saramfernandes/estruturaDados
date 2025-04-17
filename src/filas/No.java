package filas;

public class No {
	
	String valor;
	No proximo;
	
	public No(String valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return valor;
	}
	
}
