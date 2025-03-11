package poo;

public class Aluno {
	
	private int matricula;
	private String nome;
	private int idade;
	
	public Aluno() {
		this(-1, "x", -1);
	}
	
	public Aluno(int matricula, String nome, int idade) {
		this.matricula = matricula;
		this.nome = nome;
		this.idade = idade;
	}

	@Override
	public String toString() {
		return nome + " - " + idade;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}	

}
