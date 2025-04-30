package avl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArvoreAvlTeste {

	ArvoreAvl avl;
	
	@BeforeEach
	void inicializa() {
		avl = new ArvoreAvl();
		avl.inserir(new No(44));
		avl.inserir(new No(15));
		avl.inserir(new No(20));
		avl.inserir(new No(12));
		avl.inserir(new No(33));
	}
	
	@Test
	void inserirTest() {
		assertEquals(44, avl.raiz.vl);
	}
	
	@Test
	void caminhoEmOrdemTest() {
		String resultado = avl.percorrerEmOrdem();
		
		assertEquals("12 15 20 33 44 ", resultado);
	}
	
	@Test
	void caminhoPreOrdemTest() {
		String resultado = avl.percorrerPreOrdem();
		
		assertEquals("44 15 12 20 33 ", resultado);
	}
	
	@Test
	void caminhoPosOrdemTest() {
		String resultado = avl.percorrerPosOrdem();
		
		assertEquals("12 33 20 15 44 ", resultado);
	}
	
	@Test
	void removeNoFolhaTest() {
		avl.deletar(33);
		assertEquals("12 20 15 44 ", avl.percorrerPosOrdem());
	}
	
	@Test
	void removeNoUmFilhoTest() {
		avl.deletar(20);
		assertEquals("12 33 15 44 ", avl.percorrerPosOrdem());
	}
	
	@Test
	void removeNoDoisFilhosTest() {
		avl.deletar(15);
		assertEquals("12 33 20 44 ", avl.percorrerPosOrdem());
	}
	
	@Test
	void alturaTest() {
	    assertEquals(3, avl.altura());
	}
	
	@Test
	void grauDoNoTest() {
	    assertEquals(2, avl.grauDoNo(15)); // filhos: 12 e 20
	    assertEquals(1, avl.grauDoNo(20)); // filho: 33
	    assertEquals(0, avl.grauDoNo(12)); // nenhum filho
	}
	
	@Test
	void nivelDoNoTest() {
	    assertEquals(0, avl.nivelDoNo(44)); // raiz
	    assertEquals(1, avl.nivelDoNo(15)); // filho da raiz
	    assertEquals(2, avl.nivelDoNo(20)); // filho de 15
	    assertEquals(3, avl.nivelDoNo(33)); // filho de 20
	}
	
	@Test
	void contarNosTest() {
	    assertEquals(5, avl.contarNos());
	}

}
