package facade;

import java.util.ArrayList;

import material.CD;
import material.DVD;
import material.Exemplar;
import material.Livro;
import material.Material;
import material.Revista;
import usuario.AlunoGraduacao;
import usuario.AlunoPosGraduacao;
import usuario.Professor;
import usuario.Usuario;


public class SistemaBiblioteca {
	
	private ArrayList<Usuario> usuarios;
	private ArrayList<Material> materiais;
	private ArrayList<Exemplar> exemplares;
	
	private Material material;
	private Usuario usuario;
	
	//instância única da classe
	private static SistemaBiblioteca sistemaBiblioteca;
	
	//construtor privado para garatir que é singleton
	private SistemaBiblioteca(){
		materiais = new ArrayList<Material>();
		usuarios = new ArrayList<Usuario>();
		inicializaUsuarios();
		inicializaMateriais();
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
		
		for(int i=0; i<materiais.size();i++){
			if(materiais.get(i).getCodigo().equals(codMaterial)){
				System.out.println(materiais.get(i).getTitulo());
			}
		}
		
	}
	
	public void consultarUser(String codUsr){
		System.out.println("Teste Consiltar Usuário codUsr: "+codUsr);
	}
	
	public void devolverMaterial(String codUsr, String codMaterial){
		System.out.println("Devolução de Material codUsr: "+codUsr+" codMat: "+codMaterial);
	}
	
	public void pegarEmprestado(String codUsr, String codMaterial){
		
		for(int i=0; i < materiais.size();i++){
			if(materiais.get(i).getCodigo().equals(codMaterial))
				material = materiais.get(i);
		}
		
		for(int i=0;i < usuarios.size();i++){
			if(usuarios.get(i).getCodIdentificacao().equals(codUsr))
				usuario = usuarios.get(i);
		}
		
		usuario.fazerEmprestimo(codUsr, material);
		
		
	}
	
	public void reservarMaterial(String codUsr, String codMaterial){
		System.out.println("Reserva de Material codUsr: "+codUsr+" codMat: "+codMaterial);
	}
	

	
	//inicializa usuários do teste 
	private void inicializaUsuarios(){
		
		Usuario user1 = new AlunoGraduacao("123", "Joao da Silva");
		usuarios.add(user1);
		
		user1 = new AlunoPosGraduacao("456", "Luiz Fernando Rodrigues");
		usuarios.add(user1);
		
		user1 = new AlunoGraduacao("789", "Pedro Paulo");
		usuarios.add(user1);
		
		user1 = new Professor("100", "Carlos Lucena");
		usuarios.add(user1);
		
	}
	
	private void inicializaMateriais(){
		
		String [] autores = {"Addison Wesley"};
		Exemplar exemplar1 = new Exemplar("100", "01", "Disponível");
		Exemplar exemplar2 = new Exemplar("100", "02", "Disponível");

		Exemplar[] ex = {exemplar1, exemplar2};
		
		Material mat = new Livro("100", 
				"Engenharia de Software",
				2000,
				autores, 
				6, 
				"Addison Wesley", ex);
		materiais.add(mat);
		
		exemplar1 = new Exemplar("101", "03", "Disponível");
		Exemplar[] ex2 = {exemplar1};
		String[] autores2 = {"Grady Booch", "James Rumbaugh", "Ivar Jacobson"};
		mat = new Livro("101", 
				"UML – Guia do Usuário",
				2000,
				autores2, 
				7, 
				"Campus", ex2);
		materiais.add(mat);
		
		exemplar1 = new Exemplar("200", "04", "Disponível");
		Exemplar[] ex3 = {exemplar1};
		mat = new Revista("200", 
				"IEEE Transactions on Software Engineering", 
				53, 
				"Setembro", 
				2006,ex3);
		materiais.add(mat);
		
		exemplar1 = new Exemplar("201", "05", "Disponível");
		Exemplar[] ex4 = {exemplar1};
		mat = new Revista("201", 
				"IEEE Transactions on Software Engineering", 
				54, 
				"Outubro", 
				2006, ex4);
		materiais.add(mat);
		
		exemplar1 = new Exemplar("300", "06", "Disponível");
		exemplar2 = new Exemplar("300", "07", "Disponível");
		Exemplar[] ex5 = {exemplar1, exemplar2};
		String[] autores3 = {"Amy Winehouse"};
		String[] faixas = {"Rehab","You Know I'm No Good","Me & Mr Jones"};
		mat = new CD("300", "Back to Black", autores3, faixas , 2006, ex5);
		materiais.add(mat);
		
	
		
		String[] autores4 = {"Analdo Antunes"};
		String[] faixas1 = {"Longe","Invejoso", "Envelhecer"};
		mat = new CD("301", "Back to Black", autores4, faixas1, 2009, null);
		materiais.add(mat);
		
		exemplar1 = new Exemplar("400", "08", "Disponível");
		exemplar2 = new Exemplar("400", "09", "Disponível");
		Exemplar[] ex6 = {exemplar1, exemplar2};
		String[] autores5 = {"Harrison Ford", "Cate Blanchett"};
		mat = new DVD("400", "Indiana Jones and the Kingdom of the Crystal Skull", 
				autores5, 
				2008, 
				4, ex6);
		materiais.add(mat);
		
		String[] autores6 = {"William Hurt", "Tim Blake Nelson"};
		mat = new DVD("401", "Incredible Hulk", 
				autores6, 
				2008, 
				4, null);
		materiais.add(mat);
	}
	
/*	private void inicializaExemplares(){
		
		Exemplar exemplar = new Exemplar("100", "01", "Disponível");
		exemplares.add(exemplar);
		
		exemplar = new Exemplar("100", "02", "Disponível");
		exemplares.add(exemplar);
		
		exemplar = new Exemplar("101", "03", "Disponível");
		exemplares.add(exemplar);
		
		exemplar = new Exemplar("200", "04", "Disponível");
		exemplares.add(exemplar);
		
		exemplar = new Exemplar("201", "05", "Disponível");
		exemplares.add(exemplar);
		
		exemplar = new Exemplar("300", "06", "Disponível");
		exemplares.add(exemplar);
		
		exemplar = new Exemplar("300", "07", "Disponível");
		exemplares.add(exemplar);
		
		exemplar = new Exemplar("400", "08", "Disponível");
		exemplares.add(exemplar);
		
		exemplar = new Exemplar("400", "09", "Disponível");
		exemplares.add(exemplar);
	}
	*/
	
}
