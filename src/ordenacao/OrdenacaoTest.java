package ordenacao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrdenacaoTest {
	
	private int[] pOrdenado = Util.criaVetorOrdenado(1000);
	private int[] pInverso = Util.criaVetorInverso(1000);
	//private int[] pAleatorio = Util.criaVetorAleatorio(1000);
	
	private int[] mOrdenado = Util.criaVetorOrdenado(10000);
	private int[] mInverso = Util.criaVetorInverso(10000);
	//private int[] mAleatorio = Util.criaVetorAleatorio(10000);
	
	private int[] gOrdenado = Util.criaVetorOrdenado(100000);
	private int[] gInverso = Util.criaVetorInverso(100000);
	//private int[] gAleatorio = Util.criaVetorAleatorio(100000);

	@Test
	void bubbleSortOrdenadoTest() {
		System.out.println(" ");
		long inicio = System.nanoTime();
		BubbleSort.ordenar(pOrdenado);
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BubbleSort pOrdenado: " + tempo);
		
		inicio = System.nanoTime();
		BubbleSort.ordenar(mOrdenado);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BubbleSort mOrdenado: " + tempo);
		
		inicio = System.nanoTime();
		BubbleSort.ordenar(gOrdenado);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BubbleSort gOrdenado: " + tempo);
		
	}
	
	@Test
	void bubbleSortInversoTest() {
		long inicio = System.nanoTime();
		BubbleSort.ordenar(pInverso);
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BubbleSort pInverso: " + tempo);
		
		inicio = System.nanoTime();
		BubbleSort.ordenar(mInverso);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BubbleSort mInverso: " + tempo);
		
		inicio = System.nanoTime();
		BubbleSort.ordenar(gInverso);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("BubbleSort gInverso: " + tempo);
		
	}
	
	@Test
	void selectionSortOrdenadoTest() {
		System.out.println(" ");
		long inicio = System.nanoTime();
		SelectionSort.ordenar(pOrdenado);
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("SelectionSort pOrdenado: " + tempo);
		
		inicio = System.nanoTime();
		SelectionSort.ordenar(mOrdenado);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("SelectionSort mOrdenado: " + tempo);
		
		inicio = System.nanoTime();
		SelectionSort.ordenar(gOrdenado);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("SelectionSort gOrdenado: " + tempo);
		
	}
	
	@Test
	void selectionSortInversoTest() {
		System.out.println(" ");
		long inicio = System.nanoTime();
		SelectionSort.ordenar(pInverso);
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("SelectionSort pInverso: " + tempo);
		
		inicio = System.nanoTime();
		SelectionSort.ordenar(mInverso);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("SelectionSort mInverso: " + tempo);
		
		inicio = System.nanoTime();
		SelectionSort.ordenar(gInverso);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("SelectionSort gInverso: " + tempo);
		
	}

}
