package emprestimoStrategy;

import usuario.Usuario;
import material.Material;

public interface Emprestavel {
	
	void pegarEmprestado(Usuario usr, Material material);

}

