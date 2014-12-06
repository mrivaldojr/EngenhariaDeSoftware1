package usuario;

import emprestimoStrategy.EmprestimoGraducao;

public class AlunoGraduacao extends Usuario{
	
	public AlunoGraduacao(String cod, String nome){
		this.nome = nome;
		this.codIdentificacao = cod;
		
		emprestavel = new EmprestimoGraducao();
	}
	
	
	
}
