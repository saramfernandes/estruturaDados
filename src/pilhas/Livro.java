package pilhas;

public class Livro {
	
	private String titulo;
	private int paginas;
	private Livro anterior;
	
	public Livro(String titulo, int paginas) {
		this.titulo = titulo;
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return titulo + " (" + paginas + ")";
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public Livro getAnterior() {
		return anterior;
	}
	public void setAnterior(Livro anterior) {
		this.anterior = anterior;
	}
	
	
	
	
	
	

}
