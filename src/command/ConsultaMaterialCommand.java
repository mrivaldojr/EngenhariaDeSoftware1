package command;

import facade.SistemaBiblioteca;

public class ConsultaMaterialCommand implements Command{

	SistemaBiblioteca sistema;
	
	public ConsultaMaterialCommand() {
		this.sistema = SistemaBiblioteca.getInstance();
	}
	
	@Override
	public void execute(String params) {
		//só precisa de um parâmtro, não precisa tratamento
		sistema.consultarMaterial(params);	
	}

}
