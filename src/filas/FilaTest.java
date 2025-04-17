package filas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilaTest {

	private Fila fila = new Fila();
	
	@Test
	void isEmptyTrueTest() {
		assertTrue(fila.isEmpty());
	}
	
	@Test
	void isEmptyFalseTest() {
		fila.enqueue(new No("A"));
		assertFalse(fila.isEmpty());
	}
	
	@Test
	void enqueueTest() {
		fila.enqueue(new No("A"));
		assertEquals("A", fila.inicio.valor);
		assertEquals("A", fila.fim.valor);
		fila.enqueue(new No("B"));
		assertEquals("A", fila.inicio.valor);
		assertEquals("B", fila.fim.valor);
	}
	
	@Test
	void dequeueTest() {
		fila.enqueue(new No("A"));
		fila.enqueue(new No("B"));
		fila.enqueue(new No("C"));
		assertEquals("A", fila.dequeue());
		assertEquals("B", fila.inicio.valor);
		assertEquals("B", fila.dequeue());
		assertEquals("C", fila.inicio.valor);
		assertEquals("C", fila.dequeue());
		assertNull(fila.inicio);
	}
	
	@Test
	void viewTest() {
		fila.enqueue(new No("A"));
		fila.enqueue(new No("B"));
		fila.enqueue(new No("C"));
		String ret = fila.view().trim();
		assertEquals("A B C", ret);
		
	}

}
