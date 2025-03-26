package pilhas;

public class Pilha {

	private Livro topo;
	
		public boolean estaVazia() {
		return topo == null;
	}
	
	public void insere(Livro l) {
		if (estaVazia()) {
			topo = l;
		}else {
			l.setAnterior(topo);
			topo = l;
		}
	}
	
	public void remove() {
		if (!estaVazia()) {
			topo = topo.getAnterior();
		}
	}
	
	public Livro espiaTopo1() {
		return topo;
	}
	
	public String espiaTopo2() {
		if(!estaVazia()) {
			return topo.toString();
		}
		return "Pilha vazia";
	}
	
	
	public String ver() {
		if (estaVazia()) {
			return "Pilha vazia";
		}else {
			String ret = "";
			Livro aux = topo;
			while(aux != null) {
				ret += aux.toString() + ",";
				aux = aux.getAnterior();
			}
			ret = ret.substring(0, ret.length()-1);
			return ret;
		}
	}
	
}
