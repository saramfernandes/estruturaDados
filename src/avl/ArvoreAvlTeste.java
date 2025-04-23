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

}
