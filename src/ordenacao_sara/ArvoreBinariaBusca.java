package ordenacao_sara;

public class ArvoreBinariaBusca {

	No raiz;
	int tamanho = 0;

	public ArvoreBinariaBusca(int tamanho) {
		this.tamanho = tamanho;
	}

	public void inserir(int valor) {
		raiz = inserirRecursivo(raiz, valor);
	}

	private No inserirRecursivo(No no, int valor) {
		if (no == null) {
			return new No(valor);
		}
		if (valor < no.vl) {
			no.esquerda = inserirRecursivo(no.esquerda, valor);
		} else if (valor > no.vl) {
			no.direita = inserirRecursivo(no.direita, valor);
		}
		return no;
	}

	public int[] percorrerEmOrdem() {
		int[] resultado = new int[tamanho];
		percorrerEmOrdemRecursivo(raiz, resultado, new int[] { 0 });
		return resultado;
	}

	private void percorrerEmOrdemRecursivo(No no, int[] vetor, int[] indice) {
        if (no != null) {
            percorrerEmOrdemRecursivo(no.esquerda, vetor, indice);
            vetor[indice[0]] = no.vl;
            indice[0]++; 
            percorrerEmOrdemRecursivo(no.direita, vetor, indice);
        }
    }
				
		
}
