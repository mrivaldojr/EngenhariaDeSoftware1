package usuario;

import emprestimo.Emprestavel;

public class Usuario{
	
	private int codIdentificacao;
	private String nome;
	protected Emprestavel emprestavel;

	public void fazerEmprestimo(){
		emprestavel.pegarEmprestado();
	}
	
	public void setMetodoEmprestimo(Emprestavel emprestavel){
		this.emprestavel = emprestavel;
	}
	
	public int getCodIdentificacao() {
		return codIdentificacao;
	}
	public void setCodIdentificacao(int codIdentificacao) {
		this.codIdentificacao = codIdentificacao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
