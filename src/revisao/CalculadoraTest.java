package revisao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void somarTest() {
		assertEquals(8, Calculadora.somar(3, 5));
	}
	@Test
	void subtrairTest() {
		assertEquals(8, Calculadora.subtrair(13, 5));
	}
	@Test
	void multiplicarTest() {
		assertEquals(8, Calculadora.multiplicar(2, 4));
	}
	@Test
	void dividirTest() {
		assertEquals(8, Calculadora.dividir(16, 2));
	}
	@Test
	void dividirDoubleTest() {
		assertEquals(2.5, Calculadora.dividir(5, 2));
	}
	@Test
	void dividirZeroTest() {
		assertEquals(0, Calculadora.dividir(0, 2));
	}
	
	
	
	@Test
	void operacaoSomarTest() {
		Calculadora calc = new Calculadora();
		assertEquals(9, calc.operacao(7, 2, '+'));
		assertEquals(5, calc.operacao(7, 2, '-'));
		assertEquals(14, calc.operacao(7, 2, '*'));
		assertEquals(3.5, calc.operacao(7, 2, '/'));
	}
	
	
}
