package ordenacao_sara;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ordenacao.Util;

class ArvoreAvlTeste {

	ArvoreAvl avl;
	
	private int[] mOrdenado = Util.criaVetorOrdenado(10000);
	private int[] mInverso = Util.criaVetorInverso(10000);
	
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
}
