package usuario;

import emprestimo.EmprestimoPosGraducao;

public class AlunoPosGraduacao extends Usuario{
	
	public AlunoPosGraduacao(String cod, String nome) {
		
		this.nome = nome;
		this.codIdentificacao = cod;
		
		emprestavel = new EmprestimoPosGraducao();
	}
}
