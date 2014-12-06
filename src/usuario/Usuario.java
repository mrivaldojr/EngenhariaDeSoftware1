package usuario;

import java.util.ArrayList;

import reserva.Reserva;
import material.Material;
import emprestimo.Emprestimo;
import emprestimoStrategy.Emprestavel;

public class Usuario{
	
	protected String codIdentificacao;
	protected String nome;
	protected Emprestavel emprestavel;
	protected ArrayList<Emprestimo> emprestimos = new ArrayList<Emprestimo>();
	protected ArrayList<Reserva> reservas = new ArrayList<Reserva>();	
	
	//setters e getters
	public void setMetodoEmprestimo(Emprestavel emprestavel){
		this.emprestavel = emprestavel;
	}
	
	public String getCodIdentificacao() {
		return codIdentificacao;
	}
	public void setCodIdentificacao(String codIdentificacao) {
		this.codIdentificacao = codIdentificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}	
	
	public void reservarMaterial(Usuario usr, Material material){
		if(this.contReservas()>=3){
			System.out.println("Você não pode mais fazer reservas");
			return;
		}
		if(verificaReservaDuplicada(material)){
			System.out.println("Você já possui reserva para o material "
														+material.getTitulo());
			return;
		}
		
		Reserva reserva = new Reserva(usr, material);
		reserva.reservaMaterial();
		reservas.add(reserva);
	}
	
	public void removeReserva(){
		
	}
	
	private boolean verificaReservaDuplicada(Material m){
		
		for(int i=0; i<reservas.size();i++){
			if(reservas.get(i).getMaterial().getCodigo().equals(m.getCodigo())){
				return true;
			}
		}	
		return false;
	}
	
	public void fazerEmprestimo(Usuario user, Material material){
		emprestavel.pegarEmprestado(user, material);	
	}
	
	public void addEmprestimos(Emprestimo e){
		emprestimos.add(e);
	}
	
	public int contEmprestimos(){
		if(this.emprestimos==null){
			return 0;
		}
		return this.emprestimos.size();
	}
	
	public int contReservas(){
		if(this.reservas==null){
			return 0;
		}
		return this.reservas.size();
	}
	
	public boolean verificaEmprestimoIgual(String cod){
		for(int i=0;i<emprestimos.size();i++){
			if((emprestimos.get(i).getExemplar().getCodMaterial().equals(cod))&& (emprestimos.get(i).getStatus().equals("Ativo")) ){
				return true;
			}
		}
		return false;
	}
	
	public void consultaUsuario(){
		for(int i=0; i<emprestimos.size(); i++){
		}
	}
	
	public void devolverMaterial(Usuario usr, Material mat){
		for(int i=0;i<this.emprestimos.size();i++){
			if(emprestimos.get(i).getMaterialCod().equals(mat.getCodigo())){
				emprestimos.get(i).setStatus("Finalizado");
				emprestimos.get(i).devolveExemplar(emprestimos.get(i).getExemplar());
				return;
			}
			System.out.println("Não existe emprestimo do usuario:"
			+getNome()+" para o material: "+mat.getTitulo());
		}
	}
	
}
