package avl;

public class ArvoreAvl {

	No raiz;
	
	public boolean isEmpty() {
		return raiz == null;
	}
	
	public void inserir(No no) {
		raiz = inserirRecursivo(raiz, no.vl);
	}
	
	private No inserirRecursivo(No no, int valor) {
		if (no == null) {
			return new No(valor);
		}
		
		if (valor< no.vl) {
			no.esquerda = inserirRecursivo(no.esquerda, valor);
		}else if (valor > no.vl) {
			no.diretira = inserirRecursivo(no.diretira, valor);
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
			percorrerEmOrdemRecursivo(no.diretira, resultado);
		}
	}
}
