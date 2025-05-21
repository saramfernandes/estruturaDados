package busca;

import java.util.Random;

public class Util {
	
	public static int[] criaListaOrdenada(int tam) {
		int[] vetor = new int[tam];
		for(int i=0; i< tam; i++) {
			vetor[i] = i+1;
		}
		return vetor;
	}

	public static int[] criaListaPivoInicio(int tamanho) {
		Random r = new Random();

		int[] vetor = new int[tamanho];
		int contador = 1;

		vetor[0] = 999;

		while (contador < tamanho) {
			var numero = r.nextInt();
			if (numero == 999)
				continue;

			vetor[contador] = numero;
			contador++;

		}

		return vetor;
	}

	public static int[] criaListaPivoFinal(int tamanho) {
		Random r = new Random();

		int[] vetor = new int[tamanho];
		int contador = 0;

		vetor[tamanho - 1] = 999;

		while (contador < tamanho - 1) {
			var numero = r.nextInt();
			if (numero != 999) {
				vetor[contador] = numero;
				contador++;
			}
		}
		return vetor;
	}

	public static int[] criaListaPivoMeio(int tamanho) {
		Random r = new Random();

		int[] vetor = new int[tamanho];
		int contador = 0;

		int posicaoPivo = tamanho / 2;

		vetor[posicaoPivo] = 999;

		while (contador < tamanho) {
			var numero = r.nextInt();
			if (numero == 999)
				continue;

			if (contador != posicaoPivo)
				vetor[contador] = numero;

			contador++;

		}

		return vetor;
	}

}
