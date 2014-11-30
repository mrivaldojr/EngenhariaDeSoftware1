package usuario;

import emprestimo.EmprestimoProfessor;


public class Professor extends Usuario{
	
	public Professor() {
		emprestavel = new EmprestimoProfessor();
	}
	
}
