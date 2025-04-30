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
		
		if (valor < no.vl) {
			no.esquerda = inserirRecursivo(no.esquerda, valor);
		}else if (valor > no.vl) {
			no.direita = inserirRecursivo(no.direita, valor);
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
	
	public String percorrerPreOrdem() {
		StringBuilder resultado = new StringBuilder();
		percorrerPreOrdemRecursivo(raiz, resultado);
		return resultado.toString();
	}
	
	private void percorrerPreOrdemRecursivo(No no, StringBuilder resultado) {
		if (no != null) {
			resultado.append(no.toString());
			percorrerPreOrdemRecursivo(no.esquerda, resultado);
			percorrerPreOrdemRecursivo(no.direita, resultado);
		}
	}
	
	public String percorrerPosOrdem() {
		StringBuilder resultado = new StringBuilder();
		percorrerPosOrdemRecursivo(raiz, resultado);
		return resultado.toString();
	}
	
	private void percorrerPosOrdemRecursivo(No no, StringBuilder resultado) {
		if (no != null) {
			percorrerPosOrdemRecursivo(no.esquerda, resultado);
			percorrerPosOrdemRecursivo(no.direita, resultado);
			resultado.append(no.toString());
		}
	}
	
	// Deletar um valor da árvore
		public void deletar(int valor) {
			raiz = deletarRecursivo(raiz, valor);
		}

		private No deletarRecursivo(No no, int valor) {
			// Caso base: árvore vazia
			if (no == null) {
				return null;
			}

			// Busca o nó a ser removido
			if (valor < no.vl) {
				no.esquerda = deletarRecursivo(no.esquerda, valor);
			} else if (valor > no.vl) {
				no.direita = deletarRecursivo(no.direita, valor);
			} else {
				// Nó com nenhum ou um filho
				if (no.esquerda == null) {
					return no.direita;
				} else if (no.direita == null) {
					return no.esquerda;
				}

				// Nó com dois filhos: obtem o sucessor in-order (menor valor na subárvore
				// direita)
				no.vl = valorMinimo(no.direita);

				// Deletar o sucessor in-order
				no.direita = deletarRecursivo(no.direita, no.vl);
			}

			return no;
		}

		// Encontrar o menor valor na árvore
		public int valorMinimo() {
			if (raiz == null) {
				throw new IllegalStateException("Árvore vazia");
			}
			return valorMinimo(raiz);
		}

		private int valorMinimo(No no) {
			int minimo = no.vl;
			while (no.esquerda != null) {
				minimo = no.esquerda.vl;
				no = no.esquerda;
			}
			return minimo;
		}
		
		
		// calcular altura
		public int altura() {
		    return alturaRecursiva(raiz);
		}

		private int alturaRecursiva(No no) {
		    if (no == null) {
		        return -1;
		    }
		    int alturaEsquerda = alturaRecursiva(no.esquerda);
		    int alturaDireita = alturaRecursiva(no.direita);
		    return 1 + Math.max(alturaEsquerda, alturaDireita);
		}
		
		//calcular o grau de um nó
		public int grauDoNo(int valor) {
		    No no = buscarNo(raiz, valor);
		    if (no == null) {
		        throw new IllegalArgumentException("Nó com valor " + valor + " não encontrado.");
		    }

		    int grau = 0;
		    if (no.esquerda != null) grau++;
		    if (no.direita != null) grau++;
		    return grau;
		}

		private No buscarNo(No atual, int valor) {
		    if (atual == null || atual.vl == valor) {
		        return atual;
		    }

		    if (valor < atual.vl) {
		        return buscarNo(atual.esquerda, valor);
		    } else {
		        return buscarNo(atual.direita, valor);
		    }
		}
		
		// descobrir o nível de um nó
		public int nivelDoNo(int valor) {
		    return nivelRecursivo(raiz, valor, 0);
		}

		private int nivelRecursivo(No no, int valor, int nivelAtual) {
		    if (no == null) {
		        throw new IllegalArgumentException("Nó com valor " + valor + " não encontrado.");
		    }

		    if (no.vl == valor) {
		        return nivelAtual;
		    }

		    if (valor < no.vl) {
		        return nivelRecursivo(no.esquerda, valor, nivelAtual + 1);
		    } else {
		        return nivelRecursivo(no.direita, valor, nivelAtual + 1);
		    }
		}
		
		//contar quantidade de nós
		public int contarNos() {
		    return contarNosRecursivo(raiz);
		}

		private int contarNosRecursivo(No no) {
		    if (no == null) {
		        return 0;
		    }
		    return 1 + contarNosRecursivo(no.esquerda) + contarNosRecursivo(no.direita);
		}
		
		
}
