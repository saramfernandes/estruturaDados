package avl_desafio;

public class Avl {
	
	No raiz;
	
	public boolean isEmpty() {
		return raiz == null;
	}
	
	public void inserirPonto(No no) {
		raiz = inserirRecursivoPonto(raiz, no.nome, no.ponto);
	}
	
	private No inserirRecursivoPonto(No no, String nome, int ponto) {
		if (no == null) {
			return new No(ponto, nome);
		}
		
		if (ponto < no.ponto) {
			no.esquerda = inserirRecursivoPonto(no.esquerda, nome, ponto);
		}else if (ponto > no.ponto) {
			no.direita = inserirRecursivoPonto(no.direita, nome, ponto);
		}
		
		return no;
	}
	
	public void inserirNome(No no) {
		raiz = inserirRecursivoNome(raiz, no.nome, no.ponto);
	}
	
	private No inserirRecursivoNome(No no, String nome, int ponto) {
		if (no == null) {
			return new No(ponto, nome);
		}

		if (nome.compareTo(no.nome) < 0) {
			no.esquerda = inserirRecursivoNome(no.esquerda, nome, ponto);
		} else if (nome.compareTo(no.nome) > 0) {
			no.direita = inserirRecursivoNome(no.direita, nome, ponto);
		}

		return no;
	}
	
	public String percorrerEmOrdem() {
		StringBuilder resultado = new StringBuilder();
		percorrerEmOrdemRecursivo(raiz, resultado);
		return resultado.toString();
	}
	
	private void percorrerEmOrdemRecursivo(No no, StringBuilder resultado) {
		if (no != null) {
			percorrerEmOrdemRecursivo(no.esquerda, resultado);
			resultado.append(no.toString());
			percorrerEmOrdemRecursivo(no.direita, resultado);
		}
	}
	
	public Integer buscarPorNome(String nome) {
	    No no = buscarPorNomeRecursivo(raiz, nome);
	    return no != null ? no.ponto : null; // pedi ajuda para o chatgpt :)
	}

	private No buscarPorNomeRecursivo(No no, String nome) {
	    if (no == null) return null;

	    if (nome.compareToIgnoreCase(no.nome) == 0) {
	        return no; 
	    } else if (nome.compareToIgnoreCase(no.nome) < 0) {
	        return buscarPorNomeRecursivo(no.esquerda, nome);
	    } else {
	        return buscarPorNomeRecursivo(no.direita, nome); 
	    }
	}
}
