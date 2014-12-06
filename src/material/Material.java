package material;



public class Material {
	
	protected String codigo;
	protected String titulo;
	protected int anoPublicacao;

	protected Exemplar[] exemplares;
	
	public Exemplar[] getExemplares() {
		return exemplares;
	}
	public void setExemplares(Exemplar[] exemplares) {
		this.exemplares = exemplares;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	
	
	
	
}
