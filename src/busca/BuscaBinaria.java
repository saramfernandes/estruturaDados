package busca;

public class BuscaBinaria {

	public static boolean buscar(int[] vetor, int num) {
		
		int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;

            if (vetor[meio] == num) {
                return true;
            } else if (vetor[meio] < num) {
                inicio = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return false;
	}
        
	
}
