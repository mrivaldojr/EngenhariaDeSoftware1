package ui;

import java.util.Scanner;

import command.ConsultaMaterialCommand;
import command.ConsultaUsuarioCommand;
import command.Controle;
import command.DevolucaoCommand;
import command.EmprestimoCommand;
import command.FimCommand;
import command.ReservaCommand;

public class Main {

	public static void main(String[] args) {	
		String opcao ="";
		String parametros;
		int flag=0;
		
		Controle controle = new Controle();
		
		//intancia comandos
		ConsultaMaterialCommand consultaMaterialCommand = new ConsultaMaterialCommand();
		ConsultaUsuarioCommand consultaUsuarioCommand = new ConsultaUsuarioCommand();
		DevolucaoCommand devolucaoCommand = new DevolucaoCommand();
		EmprestimoCommand emprestimoCommand = new EmprestimoCommand();
		ReservaCommand reservaCommand = new ReservaCommand();
		FimCommand fimCommand = new FimCommand();
		
		//inicializa os hashmaps para ligar cada string a um comando
		controle.setComandos("dev", devolucaoCommand);
		controle.setComandos("mat", consultaMaterialCommand);
		controle.setComandos("emp", emprestimoCommand);
		controle.setComandos("usu", consultaUsuarioCommand);
		controle.setComandos("res", reservaCommand);
		controle.setComandos("fim", fimCommand);
		
		Scanner scanner = new Scanner(System.in);
		while(flag==0){
			opcao = scanner.next();
			parametros = scanner.nextLine();
			parametros = parametros.trim();
			flag = controle.executaComando(opcao, parametros);	
		}
				
	}

}
