package material;

public class Livro extends Material{
	private String[] autores;
	private int edicao;
	private String editora;
	
	public Livro(String cod, String titulo, int ano, 
			String[] autores, int edicao, String editora) {
		
		this.anoPublicacao = ano;
		this.autores = autores;
		this.codigo = cod;
		this.edicao = edicao;
		this.editora = editora;
		this.titulo = titulo;
		
	}
	
	public String[] getAutores() {
		return autores;
	}
	public void setAutores(String[] autores) {
		this.autores = autores;
	}
	public int getEdicao() {
		return edicao;
	}
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	
}
