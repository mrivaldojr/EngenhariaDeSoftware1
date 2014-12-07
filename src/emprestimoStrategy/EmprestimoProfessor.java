package emprestimoStrategy;

import material.Exemplar;
import material.Material;
import usuario.Usuario;
import emprestimo.Emprestimo;

public class EmprestimoProfessor implements Emprestavel {

	private static final int DIAS_PROF = 1;

	@Override
	public void pegarEmprestado(Usuario usr, Material material) {
		if (material.getExemplares() == null) {
			System.out.println("Este material não possui emxemplares");
			return;
		} else {
			if (usr.verificaEmprestimoIgual(material.getCodigo())) {
				System.out.println("Você já tem um empréstimo desse material");
				return;
			}

			Exemplar exemplar = material.verificaMaterialDisp();

			if (exemplar != null) {
				Emprestimo emprestimo = new Emprestimo(usr, exemplar, DIAS_PROF);
				emprestimo.setDataDev(DIAS_PROF);
				exemplar.setEmprestimo(emprestimo);
				usr.addEmprestimos(emprestimo);
				System.out
						.println("Emprestimo realizado para " + usr.getNome());
				return;
			} else {
				System.out.println("Não há exemplares disponíveis.");
			}
		}
		System.out.println("Emprestimo do professor");
	}

}
