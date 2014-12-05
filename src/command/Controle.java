package command;

import java.util.HashMap;

public class Controle {
	
	private HashMap<String, Command> comandos = new HashMap<String, Command>();
	
	public void setComandos(String tipo, Command comando){
		comandos.put(tipo, comando);
	}
	
	public void executaComando(String comando, String params){
		Command c = comandos.get(comando);
		c.execute(params);
	}
	
}
