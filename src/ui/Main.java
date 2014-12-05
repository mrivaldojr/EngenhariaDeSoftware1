package ui;

import java.util.Scanner;

import command.ConsultaMaterialCommand;
import command.ConsultaUsuarioCommand;
import command.Controle;
import command.DevolucaoCommand;
import command.EmprestimoCommand;
import command.ReservaCommand;
import facade.SistemaBiblioteca;

public class Main {

	public static void main(String[] args) {
		//só para teste
		
		String opcao ="";
		String parametros;
		
		Controle controle = new Controle();
		
		//intancia comandos
		ConsultaMaterialCommand consultaMaterialCommand = new ConsultaMaterialCommand();
		ConsultaUsuarioCommand consultaUsuarioCommand = new ConsultaUsuarioCommand();
		DevolucaoCommand devolucaoCommand = new DevolucaoCommand();
		EmprestimoCommand emprestimoCommand = new EmprestimoCommand();
		ReservaCommand reservaCommand = new ReservaCommand();
		
		//inicializa os hashmaps para ligar cada string a um comando
		controle.setComandos("dev", devolucaoCommand);
		controle.setComandos("mat", consultaMaterialCommand);
		controle.setComandos("emp", emprestimoCommand);
		controle.setComandos("usu", consultaUsuarioCommand);
		controle.setComandos("res", reservaCommand);
		
		Scanner scanner = new Scanner(System.in);
		
		while(!(opcao.equals("fim"))){
			opcao = scanner.next();
			parametros = scanner.nextLine();
			parametros = parametros.trim();
			controle.executaComando(opcao, parametros);	
		}
				
	}

}
