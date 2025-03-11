package revisao;

public class Calculadora {
	
	public double operacao(int n1, int n2, char op) {
		if (op == '+') {
			return somar(n1, n2);
		}else if (op == '-') {
			return subtrair(n1, n2);			
		}else if (op == '*') {
			return multiplicar(n1, n2);
		}else if (op == '/') {
			return dividir(n1, n2);
		}else {
			return 0.0;
		}
		
	}
	
	public static int somar (int n1, int n2) {
		return n1 + n2;
	}
	public static int subtrair (int n1, int n2) {
		return n1 - n2;
	}
	public static int multiplicar (int n1, int n2) {
		return n1 * n2;
	}
	public static double dividir (int n1, int n2) {
		if (n2 == 0) {
			return 0.0;
		}
		return n1 / (double)n2;
	}
	
}
