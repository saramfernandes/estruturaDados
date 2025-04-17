package fila_desafio;

public class No {
	String nome;
	String classificacao;
	No proximo;
	
	public No(String nome, String classificacao) {
		this.nome = nome;
		this.classificacao = classificacao;
	}
	
	@Override
	public String toString() {
		return nome + ": " + classificacao;
	}
	
}
