package usuario;

import java.util.ArrayList;
import java.util.Date;

import material.Material;
import reserva.Reserva;
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
	//--------------------------------------------
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
		
		Date dataAtual = new Date(System.currentTimeMillis());
		
		
		Reserva reserva = new Reserva(this, material, dataAtual);
		reserva.reservaMaterial();
		reservas.add(reserva);
		System.out.println("Reserva realizada com sucesso. Material: "
							+material.getTitulo()+" . Usuario: "+usr.getNome());
	}
	
	public void removeReserva(String codMat){
		for (int i = 0; i < reservas.size(); i++) {
			if(reservas.get(i).getMaterial().getCodigo().equals(codMat)){
				reservas.remove(i);
			}
		}
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
	
	//retorna falso se a data de devolução for menor que a data atual e o emprestimo estiver ativo
	public boolean verificaDebito(){
		Date dataAtual = new Date(System.currentTimeMillis());
		
		for(int i=0; i< emprestimos.size();i++){
			if( (emprestimos.get(i).getDataDev().compareTo(dataAtual)<0) &&
					(emprestimos.get(i).getStatus().equals("Ativo")) ){
				return false;
			}
		}
		return false;
	}
	
	public void consultaUsuario(){
		System.out.println("Usuário: "+this.nome);
		System.out.println("Emprestimos");
		for(int i=0; i<emprestimos.size(); i++){
			System.out.println("Título: "+emprestimos.get(i).getTituloMaterial()+". Tipo: " 
											+emprestimos.get(i).tipoMaterial()+". Status:"
					+emprestimos.get(i).getStatus() +". Data: "+emprestimos.get(i).getDataDev() );
		}
		System.out.println("Reservas");
		for(int i=0; i<reservas.size(); i++){
			System.out.println("Título:"+reservas.get(i).getMatTitulo()+". Reservado em: "+reservas.get(i).getDate());
		}
	}
	
	public void devolverMaterial(Usuario usr, Material mat){
		for(int i=0;i<this.emprestimos.size();i++){
			if(emprestimos.get(i).getMaterialCod().equals(mat.getCodigo())){
				emprestimos.get(i).setStatus("Finalizado");
				emprestimos.get(i).devolveExemplar(emprestimos.get(i).getExemplar());
				System.out.println("Exemplar: "+emprestimos.get(i).getTituloMaterial()+" devolvido com sucesso.");
				return;
			}
		}
		System.out.println("Não existe emprestimo do usuario:"
				+getNome()+" para o material: "+mat.getTitulo());
	}
	
}
