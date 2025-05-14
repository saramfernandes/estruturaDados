package ordenacao;

public class InsertionSort {

	public static int[] ordenar(int[] vetor) {
		int n = vetor.length;

		for (int i = 1; i < n; i++) {
			int chave = vetor[i];
			int j = i - 1;

			// Move os elementos maiores para frente
			while (j >= 0 && vetor[j] > chave) {
				vetor[j + 1] = vetor[j];
				j--;
			}

			vetor[j + 1] = chave;
		}

		return vetor;
	}
	
}
