package ui;

import command.ConsultaMaterialCommand;
import command.ConsultaUsuarioCommand;
import command.Controle;
import command.DevolucaoCommand;
import command.EmprestimoCommand;
import command.ReservaCommand;

public class Main {

	public static void main(String[] args) {
		
		//intancia comandos
		ConsultaMaterialCommand consultaMaterialCommand = new ConsultaMaterialCommand();
		ConsultaUsuarioCommand consultaUsuarioCommand = new ConsultaUsuarioCommand();
		DevolucaoCommand devolucaoCommand = new DevolucaoCommand();
		EmprestimoCommand emprestimoCommand = new EmprestimoCommand();
		ReservaCommand reservaCommand = new ReservaCommand();
		
		Controle controle = new Controle();
		

	}

}
