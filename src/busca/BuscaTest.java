package busca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ordenacao.QuickSort;

class BuscaTest {
	
	int[] vMelhorCaso = Util.criaListaPivoInicio(1_000_000);
	int[] vMedioCaso = Util.criaListaPivoMeio(1_000_000);
	
	@Test
	void buscaBinariaMelhorCasoTest() {
		long inicio = System.nanoTime();
		QuickSort.sort(vMelhorCaso);
		assertTrue(BuscaBinaria.buscar(vMelhorCaso, 999));
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BuscaBinaria com ordenação: " + tempo);
	}
	
	@Test
	void buscaLinearMelhorCasoTest() {
		long inicio = System.nanoTime();
		assertTrue(BuscaLinear.buscar(vMelhorCaso, 999));
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BuscaLinear Melhor Caso: " + tempo);
	}
	
	@Test
	void buscaBinariaMedioCasoTest() {
		long inicio = System.nanoTime();
		QuickSort.sort(vMedioCaso);
		assertTrue(BuscaBinaria.buscar(vMedioCaso, 999));
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BuscaBinaria com ordenação: " + tempo);
	}
	
	@Test
	void buscaLinearMedioCasoTest() {
		long inicio = System.nanoTime();
		assertTrue(BuscaLinear.buscar(vMedioCaso, 999));
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BuscaLinear Melhor Caso: " + tempo);
	}

}
