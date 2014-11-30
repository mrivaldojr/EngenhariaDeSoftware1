package command;

import facade.SistemaBiblioteca;

public class ConsultaUsuarioCommand implements Command{

	private SistemaBiblioteca sistema;
	
	public ConsultaUsuarioCommand() {
		sistema = SistemaBiblioteca.getInstance();
	}
	
	@Override
	public void execute(String params) {
		sistema.consultarUser(params);
	}

}
