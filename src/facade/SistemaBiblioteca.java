package facade;

import java.util.Scanner;


public class SistemaBiblioteca {
	
	//instância única da classe
	private static SistemaBiblioteca sistemaBiblioteca;
	
	//construtor privado para garatir que é singleton
	private SistemaBiblioteca(){
	}
	
	//método para acessar o singleton
	public static SistemaBiblioteca getInstance(){
		if(sistemaBiblioteca==null){
			sistemaBiblioteca = new SistemaBiblioteca();
		}
		return sistemaBiblioteca;
	}
	
	public void consultarMaterial(){
		
	}
}
