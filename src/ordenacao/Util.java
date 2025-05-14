package ordenacao;

import java.util.Random;

public class Util {

	public static int[] criaVetorAleatorio(int tamanho) {
		Random random = new Random();
		int vetor[] = new int[tamanho];
		for (int i = 1; i < tamanho; i++) {
			vetor[i] = random.nextInt();
		}
		return vetor;
	}
	
	public static int[] criaVetorOrdenado(int tamanho) {
		int vetor[] = new int[tamanho];
		for (int i = 1; i < tamanho; i++) {
			vetor[i] = i;
		}
		return vetor;
	}
	
	public static int[] criaVetorInverso(int tamanho) {
		int vetor[] = new int[tamanho];
		for (int i = tamanho - 1; i > 1; i--) {
			vetor[i] = i;
		}
		return vetor;
	}
	
}
