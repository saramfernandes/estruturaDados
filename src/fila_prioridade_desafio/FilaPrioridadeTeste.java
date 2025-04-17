package fila_prioridade_desafio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilaPrioridadeTeste {
	
	private FilaPrioridade fila;
	
	@BeforeEach
	void iniciaFila() {
		fila = new FilaPrioridade();
	}
	
	@Test
	void teste() {
		fila.enqueue(new No("A", 1));
		fila.enqueue(new No("B", 2));
		fila.enqueue(new No("C", 1));
		fila.enqueue(new No("D", 2));
		fila.enqueue(new No("E", 1));
		fila.enqueue(new No("F", 2));
		
		assertEquals("B", fila.inicio.valor);
		assertEquals("E", fila.fim.valor);
		assertEquals("B D F A C E", fila.view().trim());
	}
}
