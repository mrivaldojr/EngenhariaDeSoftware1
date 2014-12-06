package emprestimoStrategy;

import material.Exemplar;
import material.Material;

public class EmprestimoGraducao implements Emprestavel{

	private Material material;
	private Exemplar[] exemplares;
	
	@Override
	public void pegarEmprestado(String codUsr, Material material) {
		//implementação do empréstimo para graducação
		//limitar emprestimos abertos a 3
		//ver disponibilidade do material
		//usuario nao pode estar devedor
		//caso os exemplares não estejam reservados
		//verificar se o usuario ja tem um emprestimo daquele tipo
		
		if(material.getExemplares()==null){
			System.out.println("Este material não possui emxemplares");
		}
		else {
			exemplares = material.getExemplares();
			for(int i=0; i <exemplares.length;i++){
				if(exemplares[i].getStatus().equals("Disponível")){
					exemplares[i].setStatus("Indisponível");
					System.out.println("Emprestimo realizado");
				}
				else{
					System.out.println("Não há exemplares disponiveis");
				}
			}
		}
			
		
		System.out.println("Emprestimo de aluno de Graduação");
	}

}
