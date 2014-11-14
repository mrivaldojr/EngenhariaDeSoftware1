package teste;

import emprestimo.EmprestimoGraducao;
import emprestimo.EmprestimoProfessor;
import usuario.AlunoGraduacao;
import usuario.AlunoPosGraduacao;
import usuario.Professor;
import usuario.Usuario;

public class MainTeste {

	public static void main(String[] args) {
		Usuario user = new Professor();
		user.fazerEmprestimo();
		
		//teste do setter, provavelmente nao vai precisar
		user.setMetodoEmprestimo(new EmprestimoGraducao());
		user.fazerEmprestimo();
		
		Usuario user2 = new AlunoGraduacao();
		user2.fazerEmprestimo();
		
		Usuario user3 = new AlunoPosGraduacao();
		user3.fazerEmprestimo();
		
	}

}
