package command;

import java.util.HashMap;

public class Controle {
	int flag;
	
	private HashMap<String, Command> comandos = new HashMap<String, Command>();
	
	public Controle() {
		
	}
	
	public void setComandos(String tipo, Command comando){
		comandos.put(tipo, comando);
	}
	
	public int executaComando(String comando, String params){
		Command c = comandos.get(comando);		
		try{
			return c.execute(params);
		}
		catch(Exception e){
			//System.out.println("comando invalido");
			return 0;
		}
	}
	
}
