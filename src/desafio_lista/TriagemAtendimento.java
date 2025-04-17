package desafio_lista;

import static org.junit.Assert.assertTrue;
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
		filaTriada = new Fila();
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
		
		assertEquals("A", fila.inicio.toString());
		assertEquals("C", fila.fim.toString());
		assertEquals("A B C", fila.view().trim());
	}
	
	@Test
	void triagem() {
		// Recebendo os novos chamados
		Chamada c1 = new Chamada("A", "aaa");
		Chamada c2 = new Chamada("B", "bbb");
		Chamada c3 = new Chamada("C", "ccc");
		NoFila n1 = new NoFila(c1);
		NoFila n2 = new NoFila(c2);
		NoFila n3 = new NoFila(c3);
		fila.enqueue(n1);
		fila.enqueue(n2);
		fila.enqueue(n3);
		
		// Triando os novos chamados com uma "fila auxiliar" 
		ChamadaTriada ct1 = new ChamadaTriada(c1, 2);
		ChamadaTriada ct2 = new ChamadaTriada(c2, 3);
		ChamadaTriada ct3 = new ChamadaTriada(c3, 1);
		NoFila nt1 = new NoFila(ct1);
		NoFila nt2 = new NoFila(ct2);
		NoFila nt3 = new NoFila(ct3);
		filaTriada.enqueue(nt1);
		filaTriada.enqueue(nt2);
		filaTriada.enqueue(nt3);
		fila.dequeue();
		fila.dequeue();
		fila.dequeue();
	
		assertTrue(fila.isEmpty());
		assertEquals("A", filaTriada.inicio.toString());
		assertEquals("C", filaTriada.fim.toString());
		assertEquals("A B C", filaTriada.view().trim());
		
		// Colocando as chamadas em ordem de prioridade na lista
		ChamadaTriada aux;
		aux = filaTriada.inicio.chamadaTriada;
		lista.insereInicio(aux);
		filaTriada.dequeue();
		while (filaTriada.inicio != null) {
			aux = filaTriada.inicio.chamadaTriada;
			if (lista.getPrimeiro() != null) {
				if (aux.getSeveridade() > lista.getPrimeiro().getSeveridade()) {
					lista.insereInicio(aux);
				}else if (aux.getSeveridade() < lista.getUltimo().getSeveridade()) {
					lista.insereFinal(aux);
				}else {
					lista.insereMeio(aux, aux.getSeveridade());
				}
				filaTriada.dequeue();
			}
		}
		assertEquals("B 3 // A 2 // C 1 //", lista.view());	
	}
	
	@Test
	void despacho() {
		// Recebendo os novos chamados e triando
		Chamada c1 = new Chamada("A", "aaa");
		Chamada c2 = new Chamada("B", "bbb");
		Chamada c3 = new Chamada("C", "ccc");
		NoFila n1 = new NoFila(c1);
		NoFila n2 = new NoFila(c2);
		NoFila n3 = new NoFila(c3);
		fila.enqueue(n1);
		fila.enqueue(n2);
		fila.enqueue(n3);
		
		ChamadaTriada ct1 = new ChamadaTriada(c1, 2);
		ChamadaTriada ct2 = new ChamadaTriada(c2, 3);
		ChamadaTriada ct3 = new ChamadaTriada(c3, 1);
		NoFila nt1 = new NoFila(ct1);
		NoFila nt2 = new NoFila(ct2);
		NoFila nt3 = new NoFila(ct3);
		filaTriada.enqueue(nt1);
		filaTriada.enqueue(nt2);
		filaTriada.enqueue(nt3);
		fila.dequeue();
		fila.dequeue();
		fila.dequeue();
		
		assertTrue(fila.isEmpty());
		assertEquals("A", filaTriada.inicio.toString());
		assertEquals("C", filaTriada.fim.toString());
		assertEquals("A B C", filaTriada.view().trim());
		
		ChamadaTriada aux;
		aux = filaTriada.inicio.chamadaTriada;
		lista.insereInicio(aux);
		filaTriada.dequeue();
		while (filaTriada.inicio != null) {
			aux = filaTriada.inicio.chamadaTriada;
			if (lista.getPrimeiro() != null) {
				if (aux.getSeveridade() > lista.getPrimeiro().getSeveridade()) {
					lista.insereInicio(aux);
				}else if (aux.getSeveridade() < lista.getUltimo().getSeveridade()) {
					lista.insereFinal(aux);
				}else {
					lista.insereMeio(aux, aux.getSeveridade());
				}
				filaTriada.dequeue();
			}
		}
		assertEquals("B 3 // A 2 // C 1 //", lista.view());	
		
		// Atendendo as chamads e despachando
		
		
	}

}
