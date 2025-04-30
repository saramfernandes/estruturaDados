package avl_desafio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AvlDesafioTest {
	
	Avl avl;
	Avl avlNome;
	
	@BeforeEach
	void inicializa() {
		avl = new Avl();
		avl.inserirPonto(new No(44, "E"));
		avl.inserirPonto(new No(15, "B"));
		avl.inserirPonto(new No(20, "C"));
		avl.inserirPonto(new No(12, "A"));
		avl.inserirPonto(new No(33, "D"));
		
		avlNome = new Avl();
		avlNome.inserirNome(new No(44, "E"));
		avlNome.inserirNome(new No(15, "B"));
		avlNome.inserirNome(new No(20, "C"));
		avlNome.inserirNome(new No(12, "A"));
		avlNome.inserirNome(new No(33, "D"));
	}

	@Test
	void inserirTest() {
		assertEquals(44, avl.raiz.ponto);
		assertEquals("E", avl.raiz.nome);
	}
	
	@Test
	void listarEmOrdemTest() {
		String resultado = avl.percorrerEmOrdem();
		String resultado1 = avlNome.percorrerEmOrdem();
		
		assertEquals("A 12 B 15 C 20 D 33 E 44 ", resultado);
		assertEquals("A 12 B 15 C 20 D 33 E 44 ", resultado1);
	}
	
	@Test
	void buscarPorNome() {
		assertEquals(44, avl.buscarPorNome("E"));
		assertEquals(15, avl.buscarPorNome("B"));
		assertEquals(20, avl.buscarPorNome("C"));
		assertEquals(12, avl.buscarPorNome("A"));
		assertEquals(33, avl.buscarPorNome("D"));
		assertNull(avl.buscarPorNome("Z"));
		
		assertEquals(44, avlNome.buscarPorNome("E"));
		assertEquals(15, avlNome.buscarPorNome("B"));
		assertEquals(20, avlNome.buscarPorNome("C"));
		assertEquals(12, avlNome.buscarPorNome("A"));
		assertEquals(33, avlNome.buscarPorNome("D"));
		assertNull(avlNome.buscarPorNome("Z"));
	}
	
	
	

}
