package filas_prioridades;

public class Carro {
	String marca;
	String modelo;
	String cor;
	int ano;
	
	public Carro(String marca, String modelo, String cor, int ano) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
	}
	
	@Override
	public String toString() {
		return marca + " " + ano;
	}
	

}
