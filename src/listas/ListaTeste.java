package listas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaTeste {
	
	private Lista lista;
	
	@BeforeEach
	private void inicializa() {
		lista = new Lista();
	}

	@Test
	void isEmptyTest() {
		assertEquals(0, lista.getTamanho());
		assertNull(lista.getPrimeiro());
		assertNull(lista.getUltimo());
	}
	
	@Test
	void insereInicioTest() {
		lista.insereInicio(new Elemento("A"));
		assertEquals(1, lista.getTamanho());
		assertEquals("A", lista.getPrimeiro().getValor());
		assertEquals("A", lista.getUltimo().getValor());
		
		lista.insereInicio(new Elemento("B"));
		assertEquals(2, lista.getTamanho());
		assertEquals("B", lista.getPrimeiro().getValor());
		assertEquals("A", lista.getUltimo().getValor());
	}
	
	@Test
	void insereFinalTest() {
		lista.insereFinal(new Elemento("C"));
		assertEquals(1, lista.getTamanho());
		assertEquals("C", lista.getPrimeiro().getValor());
		assertEquals("C", lista.getUltimo().getValor());
		
		lista.insereFinal(new Elemento("D"));
		assertEquals(2, lista.getTamanho());
		assertEquals("C", lista.getPrimeiro().getValor());
		assertEquals("D", lista.getUltimo().getValor());
	}
	
	@Test
	void removeInicioTest() {
		lista.insereInicio(new Elemento("C"));
		lista.insereInicio(new Elemento("B"));
		lista.insereInicio(new Elemento("A"));
		
		lista.removeInicio();
		assertEquals(2, lista.getTamanho());
		assertEquals("B", lista.getPrimeiro().getValor());
		assertEquals("C", lista.getUltimo().getValor());
		
		lista.removeInicio();
		assertEquals(1, lista.getTamanho());
		assertEquals("C", lista.getPrimeiro().getValor());
		assertEquals("C", lista.getUltimo().getValor());
	}
	
	@Test
	void removeFinalTest() {
		lista.insereInicio(new Elemento("C"));
		lista.insereInicio(new Elemento("B"));
		lista.insereInicio(new Elemento("A"));
		
		lista.removeFinal();
		assertEquals(2, lista.getTamanho());
		assertEquals("A", lista.getPrimeiro().getValor());
		assertEquals("B", lista.getUltimo().getValor());
		
		lista.removeFinal();
		assertEquals(1, lista.getTamanho());
		assertEquals("A", lista.getPrimeiro().getValor());
		assertEquals("A", lista.getUltimo().getValor());
	}
	
	@Test
	void buscarTest() {
		Elemento e1 = new Elemento("A");
		Elemento e2 = new Elemento("B");
		Elemento e3 = new Elemento("C");
		Elemento e4 = new Elemento("D");
		Elemento e5 = new Elemento("E");
		
		lista.insereInicio(e5);
		lista.insereInicio(e4);
		lista.insereInicio(e3);
		lista.insereInicio(e2);
		lista.insereInicio(e1);
		
		assertEquals(true, lista.buscar(e1));
	}
	
	@Test
	void viewTest() {
		lista.insereInicio(new Elemento("C"));
		lista.insereInicio(new Elemento("B"));
		lista.insereInicio(new Elemento("A"));
		
		assertEquals("A B C", lista.view());
	}

}
