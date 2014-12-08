package command;

import facade.SistemaBiblioteca;

public class ConsultaMaterialCommand implements Command{

	private SistemaBiblioteca sistema;
	
	public ConsultaMaterialCommand() {
		this.sistema = SistemaBiblioteca.getInstance();
	}
	
	@Override
	public int execute(String params) {
		//só precisa de um parâmtro, não precisa tratamento
		sistema.consultarMaterial(params);
		return 0;	
	}

}
