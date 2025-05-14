package ordenacao;

public class BubbleSort {

	public static int[] ordenar(int[] vetor) {
		int n = vetor.length-1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i; j++) {
				if (vetor[j] > vetor[j + 1]) {
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
				}
			}
		}
		return vetor;
	}
	
}
