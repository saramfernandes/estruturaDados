package desafio_lista;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TriagemAtendimento {
	
	Pilha pilha;
	Fila fila;
	Fila filaTriada;
	Lista lista;
	
	
	@BeforeEach
	void criaEstrutura() {
		pilha = new Pilha();
		fila = new Fila();
		lista = new Lista();
	}
	
	@Test
	void novasChamadas() {
		Chamada c1 = new Chamada("A", "aaa");
		Chamada c2 = new Chamada("B", "bbb");
		Chamada c3 = new Chamada("C", "ccc");
		
		NoFila n1 = new NoFila(c1);
		NoFila n2 = new NoFila(c2);
		NoFila n3 = new NoFila(c3);
		
		fila.enqueue(n1);
		fila.enqueue(n2);
		fila.enqueue(n3);		
		
		assertEquals("A", fila.inicio.valor.toString());
		assertEquals("C", fila.fim.valor.toString());
		assertEquals("A B C", fila.view().trim());
	}
	
	@Test
	void triagem() {
		Chamada c1 = new Chamada("A", "aaa");
		Chamada c2 = new Chamada("B", "bbb");
		Chamada c3 = new Chamada("C", "ccc");
		
		NoFila n1 = new NoFila(c1);
		NoFila n2 = new NoFila(c2);
		NoFila n3 = new NoFila(c3);
		
		fila.enqueue(n1);
		fila.enqueue(n2);
		fila.enqueue(n3);		
		
	}
	


}
