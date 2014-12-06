package emprestimoStrategy;

import material.Material;

public class EmprestimoPosGraducao implements Emprestavel{

	@Override
	public void pegarEmprestado(String codUsr, Material material) {
		System.out.println("Emprestimo de pos grad");
	}

}
