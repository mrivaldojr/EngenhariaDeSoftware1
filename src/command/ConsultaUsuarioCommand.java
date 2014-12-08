package command;

import facade.SistemaBiblioteca;

public class ConsultaUsuarioCommand implements Command{

	private SistemaBiblioteca sistema;
	
	public ConsultaUsuarioCommand() {
		sistema = SistemaBiblioteca.getInstance();
	}
	
	@Override
	public int execute(String params) {
		//só precisa de um parâmtro, não precisa tratamento
		sistema.consultarUser(params);
		return 0;
	}

}
