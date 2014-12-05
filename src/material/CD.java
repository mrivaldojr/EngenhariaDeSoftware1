package material;

public class CD extends Material{
	private String[] autores;
	private String[] faixas;
	
	public CD(String cod, String titulo, 
			String[] autores, String[] faixas, int ano) {
		
		this.anoPublicacao = ano;
		this.autores = autores;
		this.codigo = cod;
		this.faixas = faixas;
		this.titulo = titulo;
		
	}
	
	public String[] getAutores() {
		return autores;
	}
	public void setAutores(String[] autores) {
		this.autores = autores;
	}
	public String[] getFaixas() {
		return faixas;
	}
	public void setFaixas(String[] faixas) {
		this.faixas = faixas;
	}
}
