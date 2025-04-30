package avl;

public class No {
	
	int vl;
	No esquerda;
	No direita;
	
	public No(int vl) {
		this.vl = vl;
	}
	
	@Override
	public String toString() {
		return vl + " ";
	}
}
