package emprestimoStrategy;

import usuario.Usuario;
import material.Material;

public class EmprestimoProfessor implements Emprestavel{

	@Override
	public void pegarEmprestado(Usuario usr, Material material) {
		//implementação do empréstimo para professor
		System.out.println("Emprestimo do professor");
	}

}
