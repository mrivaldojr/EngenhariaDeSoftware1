package usuario;

import emprestimo.Emprestavel;

public class Usuario implements Emprestavel {
	
	private int codIdentificacao;
	private String nome;
	public Emprestavel emprestavel;
	
	public void fazerEmprestimo(){
		emprestavel.emprestar();
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
	
	@Override
	public void emprestar() {
		// TODO Auto-generated method stub
		
	}
	
}
