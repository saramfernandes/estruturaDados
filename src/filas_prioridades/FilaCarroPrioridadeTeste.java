package filas_prioridades;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilaCarroPrioridadeTeste {
	
private FilaPrioridade fila;
	
	@BeforeEach
	void iniciaFila() {
		fila = new FilaPrioridade();
	}

	@Test
	void insereMeioMesmaPrioridadeTest() {
		fila.enqueue(new No(new Carro("Ford", "Ka", "branco", 2013), 15));
		fila.enqueue(new No(new Carro("Toyota", "Corolla", "prata", 2021), 10));
		fila.enqueue(new No(new Carro("Chevrolet", "Onix", "chumbo", 2019), 12));
		assertEquals("Ford 2013", fila.inicio.valor.toString());
		assertEquals("Toyota 2021", fila.fim.valor.toString());
		assertEquals("Ford 2013 Chevrolet 2019 Toyota 2021", fila.view().trim());
	}

}
