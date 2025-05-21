package busca;

public class BuscaLinear {
	
	public static boolean buscar(int[] vetor, int num) {
		for (int elemento : vetor) {
			if (elemento == num) {
				return true;
			}
		}
		return false;
	}

}
