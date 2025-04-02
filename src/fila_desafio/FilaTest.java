package fila_desafio;

import org.junit.jupiter.api.Test;



class FilaTest {
	
	private Fila filaUr = new Fila();
	private Fila filaEr = new Fila();

	@Test
	void cadastrarPaciente() {
		filaUr.enqueue(new No("A", "Urgencia"));
		filaUr.enqueue(new No("B", "Urgencia"));
		filaUr.enqueue(new No("C", "Urgencia"));
		filaEr.enqueue(new No("A", "Ermegencia"));
		filaEr.enqueue(new No("B", "Ermegencia"));
		filaEr.enqueue(new No("C", "Ermegencia"));
	}

	@Test
	void atender() {
		while (filaEr.inicio != null) {
			if (filaUr.inicio != null) {
				while (filaUr.inicio != null) {
					filaUr.dequeue();
				}
			}
			filaEr.dequeue();
		}
	}
	
}
