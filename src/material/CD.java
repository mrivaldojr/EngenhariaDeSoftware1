package material;

public class CD extends Material{
	private String[] autores;
	private String[] faixas;
	
	public CD(String cod, String titulo, 
			String[] autores, String[] faixas, int ano, Exemplar[] exemplares) {
		
		this.anoPublicacao = ano;
		this.autores = autores;
		this.codigo = cod;
		this.faixas = faixas;
		this.titulo = titulo;
		this.exemplares = exemplares;
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
	
	public void putMaterialExemplar(){
		for(int i=0; i <exemplares.length;i++){
			exemplares[i].setMaterial(this);
		}
	}
}
