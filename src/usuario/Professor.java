package usuario;

import emprestimoStrategy.EmprestimoProfessor;


public class Professor extends Usuario{
	
	public Professor(String cod, String nome) {
		
		this.nome = nome;
		this.codIdentificacao = cod;
		
		emprestavel = new EmprestimoProfessor();
	}
	
}
