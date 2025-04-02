package filas_prioridades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilaTeste { 
	
	private FilaPrioridade fila;
	
	@BeforeEach
	void iniciaFila() {
		fila = new FilaPrioridade();
	}

	@Test
	void insereFilaVaziaTest() {
		fila.enqueue(new No("A", 10));
		assertEquals("A", fila.inicio.valor);
		assertEquals("A", fila.fim.valor);
		assertEquals("A ", fila.view());
	}
	
	@Test
	void insereMaiorPrioridadeVaziaTest() {
		fila.enqueue(new No("A", 10));
		fila.enqueue(new No("B", 11));
		assertEquals("B", fila.inicio.valor);
		assertEquals("A", fila.fim.valor);
		assertEquals("B A", fila.view().trim());
	}
	
	@Test
	void insereMenorPrioridadeTest() {
		fila.enqueue(new No("A", 10));
		fila.enqueue(new No("B", 11));
		fila.enqueue(new No("C", 9));
		assertEquals("B", fila.inicio.valor);
		assertEquals("C", fila.fim.valor);
		assertEquals("B A C", fila.view().trim());
	}
	
	@Test
	void insereMeioTest() {
		fila.enqueue(new No("A", 15));
		fila.enqueue(new No("B", 10));
		fila.enqueue(new No("C", 5));
		fila.enqueue(new No("D", 3));
		fila.enqueue(new No("E", 4));
		assertEquals("A", fila.inicio.valor);
		assertEquals("D", fila.fim.valor);
		assertEquals("A B C E D", fila.view().trim());
	}
	
	@Test
	void insereMeioMesmaPrioridadeTest() {
		fila.enqueue(new No("A", 15));
		fila.enqueue(new No("B", 10));
		fila.enqueue(new No("C", 5));
		fila.enqueue(new No("D", 3));
		fila.enqueue(new No("E", 10));
		assertEquals("A", fila.inicio.valor);
		assertEquals("D", fila.fim.valor);
		assertEquals("A B E C D", fila.view().trim());
	}

}
