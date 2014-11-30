package command;

import facade.SistemaBiblioteca;

public class EmprestimoCommand implements Command{

	private String splited[];
	private String idUsr, idMat;
	
	private SistemaBiblioteca sistema;
	
	public EmprestimoCommand() {
		sistema = SistemaBiblioteca.getInstance();
	}
	
	@Override
	public void execute(String params) {
		splited = params.split(" ");
		idUsr = splited[0];
		idMat = splited[1];
		sistema.pegarEmprestado(idUsr, idMat);
		
	}
	
}
