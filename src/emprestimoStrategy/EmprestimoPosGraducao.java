package emprestimoStrategy;

import emprestimo.Emprestimo;
import usuario.Usuario;
import material.Exemplar;
import material.Material;

public class EmprestimoPosGraducao implements Emprestavel{
	
	private static final int DIAS_POS_GRAD = 3;

	@Override
	public void pegarEmprestado(Usuario usr, Material material) {
		
		if (material.getExemplares() == null) {
			System.out.println("Este material não possui emxemplares");
			return;
		}

		else {
			// verifica se o usuário já tem 4 emprestimos
			if (usr.contEmprestimos() >= 4) {
				System.out.println("Usuario: " + usr.getNome()
						+ " já possui 4 emprestimos");
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
			
			//se tiver mais reservas que exemplares e uma delas for do usuario 
			//tem que remover a reserva
			if(material.verificaReservaUsr(usr.getCodIdentificacao())!=-1){
				material.excuirReserva(usr.getCodIdentificacao());
				usr.removeReserva(material.verificaReservaUsr(usr.getCodIdentificacao()));
			}
			
			Exemplar exemplar = material.verificaMaterialDisp();
			
			if (exemplar != null) {
				Emprestimo emprestimo = new Emprestimo(usr, exemplar,
						DIAS_POS_GRAD);
				emprestimo.setDataDev(DIAS_POS_GRAD);
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
