package pilhas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PilhaTeste {
	
	Pilha pilha;
	
	@BeforeEach
	void criaPilha() {
		pilha = new Pilha();
	}

	@Test
	void verificaPilhaVazia() {
		assertTrue(pilha.estaVazia());	
	}
	
	@Test
	void insereTest() {
		pilha.insere(new Livro("A", 10));
		assertFalse(pilha.estaVazia());
		assertEquals("A (10)", pilha.espiaTopo2());
		pilha.insere(new Livro("B", 20));
		assertEquals("B (20)", pilha.espiaTopo2());
		assertEquals("B (20),A (10)", pilha.ver());
		
	}
	
	@Test
	void removeTest() {
		pilha.insere(new Livro("A", 10));
		pilha.insere(new Livro("B", 20));
		pilha.remove();
		assertEquals("A (10)", pilha.espiaTopo2());
		pilha.remove();
		assertTrue(pilha.estaVazia());
		assertEquals("Pilha vazia", pilha.espiaTopo2());
		assertEquals("Pilha vazia", pilha.ver());
	}

}
