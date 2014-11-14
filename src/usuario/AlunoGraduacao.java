package usuario;

import emprestimo.EmprestimoGraducao;

public class AlunoGraduacao extends Usuario{
	
	public AlunoGraduacao() {
		emprestavel = new EmprestimoGraducao();
	}

}
