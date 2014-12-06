package emprestimoStrategy;

import material.Exemplar;
import material.Material;
import usuario.Usuario;
import emprestimo.Emprestimo;

public class EmprestimoGraducao implements Emprestavel {

	private static final int DIAS_GRAD = 1;

	private Material material;

	@Override
	public void pegarEmprestado(Usuario usr, Material material) {
		// implementação do empréstimo para graducação
		// limitar emprestimos abertos a 3 ok
		// ver disponibilidade do material ok
		// usuario nao pode estar devedor <--------------------
		// caso os exemplares não estejam reservados
		// verificar se o usuario ja tem um emprestimo daquele tipo ok

		if (material.getExemplares() == null) {
			System.out.println("Este material não possui emxemplares");
			return;
		}

		else {
			// verifica se o usuário já tem 3 emprestimos
			if (usr.contEmprestimos() >= 3) {
				System.out.println("Usuario: " + usr.getNome()
						+ " já possui 3 emprestimos");
				return;
			}
			
			if (usr.verificaEmprestimoIgual(material.getCodigo())) {
				System.out.println("Você já tem um empréstimo desse material");
				return;
			}

			//se tiver mais reservas do que exemplares e nenhuma reserva for do usuário
			if(material.contReservas()>material.contExemplaresDisp() &&
					(material.verificaReservaUsr(usr.getCodIdentificacao())==-1)){
					System.out.println("Há mais reservas do que exemplares disponíveis");
					return;
			}
			
			Exemplar exemplar = material.verificaMaterialDisp();
			
			if (exemplar != null) {
				Emprestimo emprestimo = new Emprestimo(usr, exemplar,
						DIAS_GRAD);
				emprestimo.setDataDev(DIAS_GRAD);
				exemplar.setEmprestimo(emprestimo);
				usr.addEmprestimos(emprestimo);
				System.out
						.println("Emprestimo realizado para " + usr.getNome());
				return;
			}
			else{
				System.out.println("Não há exemplares disponíveis.");
			}
		}
	}

}
