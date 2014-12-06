package material;

public class DVD extends Material{
	private String[] autores;
	private int regiao;
	
	public DVD(String cod, String titulo, 
			String[] autores, int ano, int regiao, Exemplar[] exemplares) {
		
		this.anoPublicacao = ano;
		this.autores = autores;
		this.codigo = cod;
		this.titulo = titulo;
		this.regiao = regiao;
		this.exemplares = exemplares;
		
	}
	
	public String[] getAutores() {
		return autores;
	}
	public void setAutores(String[] autores) {
		this.autores = autores;
	}
	public int getRegiao() {
		return regiao;
	}
	public void setRegiao(int regiao) {
		this.regiao = regiao;
	}
}
