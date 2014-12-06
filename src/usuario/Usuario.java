package usuario;

import reserva.Reserva;
import material.Material;
import emprestimoStrategy.Emprestavel;

public class Usuario{
	
	protected String codIdentificacao;
	protected String nome;
	protected Emprestavel emprestavel;
	protected Reserva[] reservas;

	public void fazerEmprestimo(String codUsr, Material material){
		emprestavel.pegarEmprestado(codUsr, material);	
	}
	
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
	
	
	
	
}
