package emprestimo;

import material.Material;

public class EmprestimoGraducao implements Emprestavel{

	private Material material;
	
	@Override
	public void pegarEmprestado() {
		//implementação do empréstimo para graducação
		System.out.println("Emprestimo de aluno de Graduação");
	}

}
