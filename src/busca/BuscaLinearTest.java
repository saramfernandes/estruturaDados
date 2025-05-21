package busca;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BuscaLinearTest {

	int[] vMelhorCaso = Util.criaListaPivoInicio(100_000);
	int[] vMedioCaso = Util.criaListaPivoMeio(100_000);
	int[] vPiorCaso = Util.criaListaPivoFinal(100_000);
	
	@Test
	void buscaLinearMelhorCasoTest() {
		long inicio = System.nanoTime();
		assertTrue(BuscaLinear.buscar(vMelhorCaso, 999));
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BuscaLinear Melhor Caso: " + tempo);
	}
	
	@Test
	void buscaLinearMedioCasoTest() {
		long inicio = System.nanoTime();
		assertTrue(BuscaLinear.buscar(vMedioCaso, 999));
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BuscaLinear Medio Caso: " + tempo);
	}
	
	@Test
	void buscaLinearPiorCasoTest() {
		long inicio = System.nanoTime();
		assertTrue(BuscaLinear.buscar(vPiorCaso, 999));
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BuscaLinear Pior Caso: " + tempo);
	}

}
