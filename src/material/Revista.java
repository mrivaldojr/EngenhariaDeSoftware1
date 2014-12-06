package material;

public class Revista extends Material{
	private int edicao;
	private String mes;
	
	public Revista(String cod, String titulo, int edicao, String mes, 
			int ano, Exemplar[] exemplares) {
		
		this.anoPublicacao = ano;
		this.codigo = cod;
		this.edicao = edicao;
		this.mes = mes;
		this.titulo = titulo;
		this.exemplares = exemplares;
	}
	
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
}
