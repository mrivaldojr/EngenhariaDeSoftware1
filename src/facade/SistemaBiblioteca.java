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
	
	//métodos da fachada que vão se comunicar com as classes de modelo
	public void consultarMaterial(String codMaterial){
		System.out.println("Teste Consultar Material codMat: "+codMaterial);
	}
	
	public void consultarUser(String codUsr){
		System.out.println("Teste Consiltar Usuário codUsr: "+codUsr);
	}
	
	public void devolverMaterial(String codUsr, String codMaterial){
		System.out.println("Devolução de Material codUsr: "+codUsr+" codMat: "+codMaterial);
	}
	
	public void pegarEmprestado(String codUsr, String codMaterial){
		System.out.println("Empréstimo de MaterialcodUsr: "+codUsr+" codMat: "+codMaterial);
	}
	
	public void reservarMaterial(String codUsr, String codMaterial){
		System.out.println("Reserva de Material codUsr: "+codUsr+" codMat: "+codMaterial);
	}
}
