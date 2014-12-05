package usuario;

import emprestimo.Emprestavel;

public class Usuario{
	
	protected String codIdentificacao;
	protected String nome;
	protected Emprestavel emprestavel;

	public void fazerEmprestimo(){
		emprestavel.pegarEmprestado();
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
