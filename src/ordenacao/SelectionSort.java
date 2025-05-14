package ordenacao;

public class SelectionSort {

	public static int[] ordenar(int[] vetor) {
		int n = vetor.length;

		for (int i = 0; i < n - 1; i++) {
			// Encontra o índice do menor elemento na parte não ordenada
			int indiceMenor = i;
			for (int j = i + 1; j < n; j++) {
				if (vetor[j] < vetor[indiceMenor]) {
					indiceMenor = j;
				}
			}

			// Troca o menor elemento encontrado com o primeiro elemento não ordenado
			if (indiceMenor != i) {
				int temp = vetor[i];
				vetor[i] = vetor[indiceMenor];
				vetor[indiceMenor] = temp;
			}
		}
		
		return vetor;
	}
	
}
