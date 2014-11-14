package emprestimo;

public class EmprestimoProfessor implements Emprestavel{

	@Override
	public void pegarEmprestado() {
		//implementação do empréstimo para professor
		System.out.println("Emprestimo do professor");
	}

}
