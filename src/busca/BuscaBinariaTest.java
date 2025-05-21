package busca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuscaBinariaTest {
	int[] vetor = Util.criaListaOrdenada(1_000_000);

	@Test
	void buscaBinariaPiorCasoTest() {
		long inicio = System.nanoTime();
		assertTrue(BuscaLinear.buscar(vetor, 1_000_000));
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BuscaBinaria Pior Caso: " + tempo);
	}
	
	@Test
	void buscaBinariaMelhorCasoTest() {
		long inicio = System.nanoTime();
		assertTrue(BuscaLinear.buscar(vetor, 500_000));
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BuscaBinaria Melhor Caso: " + tempo);
	}

}
