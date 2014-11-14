package usuario;

import emprestimo.EmprestimoPosGraducao;

public class AlunoPosGraduacao extends Usuario{
	
	public AlunoPosGraduacao() {
		emprestavel = new EmprestimoPosGraducao();
	}
}
