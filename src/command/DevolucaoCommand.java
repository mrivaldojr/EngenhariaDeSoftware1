package command;

import facade.SistemaBiblioteca;

public class DevolucaoCommand implements Command {
	
	private String splited[];
	private String idUsr, idMat;
	
	private SistemaBiblioteca sistema;
	
	public DevolucaoCommand() {
		this.sistema = SistemaBiblioteca.getInstance();
	}
	
	@Override
	public void execute(String params) {
		splited = params.split(" ");
		idUsr = splited[0];
		idMat = splited[1];
		
		sistema.devolverMaterial(idUsr, idMat);
	}

}
