package emprestimoStrategy;

import material.Material;

public class EmprestimoProfessor implements Emprestavel{

	@Override
	public void pegarEmprestado(String codUsr, Material material) {
		//implementação do empréstimo para professor
		System.out.println("Emprestimo do professor");
	}

}
