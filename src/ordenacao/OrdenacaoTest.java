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
	
	private int[] gOrdenado = Util.criaVetorOrdenado(1000000);
	private int[] gInverso = Util.criaVetorInverso(1000000);
	//private int[] gAleatorio = Util.criaVetorAleatorio(100000);
	
	
	
	private int[] pqOrdenado = Util.criaVetorOrdenado(1000);
	private int[] pqInverso = Util.criaVetorInverso(1000);
	//private int[] pAleatorio = Util.criaVetorAleatorio(1000);
	
	private int[] mqOrdenado = Util.criaVetorOrdenado(10000);
	private int[] mqInverso = Util.criaVetorInverso(10000);
	//private int[] mAleatorio = Util.criaVetorAleatorio(10000);
	
	private int[] gqOrdenado = Util.criaVetorOrdenado(10000000);
	private int[] gqInverso = Util.criaVetorInverso(10000000);
	//private int[] gAleatorio = Util.criaVetorAleatorio(100000);
	
	

/*	@Test
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
	
	@Test
	void insertionSortOrdenadoTest() {
		System.out.println(" ");
		long inicio = System.nanoTime();
		InsertionSort.ordenar(pOrdenado);
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("InsertionSort pOrdenado: " + tempo);
		
		inicio = System.nanoTime();
		InsertionSort.ordenar(mOrdenado);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("InsertionSort mOrdenado: " + tempo);
		
		inicio = System.nanoTime();
		InsertionSort.ordenar(gOrdenado);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("InsertionSort gOrdenado: " + tempo);
		
	}
	
	@Test
	void insertionSortInversoTest() {
		System.out.println(" ");
		long inicio = System.nanoTime();
		InsertionSort.ordenar(pInverso);
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("InsertionSort pInverso: " + tempo);
		
		inicio = System.nanoTime();
		InsertionSort.ordenar(mInverso);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("InsertionSort mInverso: " + tempo);
		
		inicio = System.nanoTime();
		InsertionSort.ordenar(gInverso);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("InsertionSort gInverso: " + tempo);
		
	} */

	
	/* BubbleSort pInverso: 1.8289
	BubbleSort mInverso: 8.7817
	BubbleSort gInverso: 69263.8018
	 
	SelectionSort pOrdenado: 2.4268
	SelectionSort mOrdenado: 12.0251
	SelectionSort gOrdenado: 67869.6456
	 
	BubbleSort pOrdenado: 0.0803
	BubbleSort mOrdenado: 6.5905
	BubbleSort gOrdenado: 67081.3814
	 
	SelectionSort pInverso: 0.0721
	SelectionSort mInverso: 6.3008
	SelectionSort gInverso: 62067.3358
	 
	InsertionSort pInverso: 0.7503
	InsertionSort mInverso: 0.2108
	InsertionSort gInverso: 3.7691
	 
	InsertionSort pOrdenado: 0.0047
	InsertionSort mOrdenado: 0.2647
	InsertionSort gOrdenado: 2.9107 */
	
	@Test
	void margeSortOrdenadoTest() {
		System.out.println(" ");
		long inicio = System.nanoTime();
		MergeSort.sort(pOrdenado);
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("MergeSort pOrdenado: " + tempo);
		
		inicio = System.nanoTime();
		MergeSort.sort(mOrdenado);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("MergeSort mOrdenado: " + tempo);
		
		inicio = System.nanoTime();
		MergeSort.sort(gOrdenado);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("MergeSort gOrdenado: " + tempo);
		
	}
	
	@Test
	void insertionSortInversoTest() {
		System.out.println(" ");
		long inicio = System.nanoTime();
		MergeSort.sort(pInverso);
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("MergeSort pInverso: " + tempo);
		
		inicio = System.nanoTime();
		MergeSort.sort(mInverso);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("MergeSort mInverso: " + tempo);
		
		inicio = System.nanoTime();
		MergeSort.sort(gInverso);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("MergeSort gInverso: " + tempo);
		
	}
	
	
	@Test
	void quickSortOrdenadoTest() {
		System.out.println(" ");
		long inicio = System.nanoTime();
		QuickSort.sort(pqOrdenado);
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("QuickSort pOrdenado: " + tempo);
		
		inicio = System.nanoTime();
		QuickSort.sort(mqOrdenado);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("QuickSort mOrdenado: " + tempo);
		
		inicio = System.nanoTime();
		QuickSort.sort(gqOrdenado);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("QuickSort gOrdenado: " + tempo);
		
	}
	
	@Test
	void quickSortInversoTest() {
		System.out.println(" ");
		long inicio = System.nanoTime();
		QuickSort.sort(pqInverso);
		long fim = System.nanoTime();
		double tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("QuickSort pInverso: " + tempo);
		
		inicio = System.nanoTime();
		QuickSort.sort(mqInverso);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("QuickSort mInverso: " + tempo);
		
		inicio = System.nanoTime();
		QuickSort.sort(gqInverso);
		fim = System.nanoTime();
		tempo = (fim - inicio) / 1_000_000.0;
		System.out.println("QuickSort gInverso: " + tempo);
		
	}
	
}
