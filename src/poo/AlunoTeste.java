package poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlunoTeste {

	@Test
	void cadastroAlunoTest() {
		Aluno a1 = new Aluno(1, "A", 1);
		Aluno a2 = new Aluno(2, "B", 2);
		Aluno a3 = new Aluno();
		Aluno[] alunos = new Aluno[3];
		alunos[0] = a1;
		alunos[1] = a2;
		alunos[2] = a3;
		assertEquals("A - 1", alunos[0].toString());
		assertEquals("B - 2", alunos[1].toString());
		assertEquals("x - -1", alunos[2].toString());
	}

}
