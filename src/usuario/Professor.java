package usuario;

import emprestimo.Emprestavel;

public class Professor extends Usuario{
	
	public Professor() {
		emprestavel = new Emprestavel() {
			@Override
			public void emprestar() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
}
