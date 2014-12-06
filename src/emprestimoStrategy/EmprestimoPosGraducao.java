package emprestimoStrategy;

import usuario.Usuario;
import material.Material;

public class EmprestimoPosGraducao implements Emprestavel{

	@Override
	public void pegarEmprestado(Usuario usr, Material material) {
		System.out.println("Emprestimo de pos grad");
	}

}
