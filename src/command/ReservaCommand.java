package command;

import facade.SistemaBiblioteca;

public class ReservaCommand implements Command{
	
	private String splited[];
	private String idUsr, idMat;
	
	private SistemaBiblioteca sistema;
	
	public ReservaCommand() {
		sistema = SistemaBiblioteca.getInstance();
	}
	
	@Override
	public void execute(String params) {
		splited = params.split(" ");
		idUsr = splited[0];
		idMat = splited[1];
		sistema.reservarMaterial(idUsr, idMat);
		
	}

}
