package command;

/*
Interface que deve ser implementada
em qualquer objeto concreto de comando
*/

public interface Command {
	//como cada classe comando pode receber um numero diferente de parametros
	// pega a String e toda da entrada e trata ela em cada implementação do execute() 
	public int execute(String params);
	
}
