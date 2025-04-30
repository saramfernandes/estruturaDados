package avl_desafio;

public class No {
	
	int ponto;
	String nome;
	No esquerda;
	No direita;
	
	public No(int ponto, String nome) {
		this.ponto = ponto;
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return nome + " " + ponto + " ";
	}
}
