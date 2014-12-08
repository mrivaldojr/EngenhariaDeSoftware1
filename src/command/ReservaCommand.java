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
	public int execute(String params) {
		//pega o parâmetro obtido na entrada e divide entre os espacos
		//e passa para o método da fachada
		splited = params.split(" ");
		idUsr = splited[0];
		idMat = splited[1];
		sistema.reservarMaterial(idUsr, idMat);
		return 0;
		
	}

}
