package material;

import emprestimo.Emprestimo;

public class Exemplar {

	private String codMaterial;
	private String codExemplar;
	private String status;
	private Emprestimo emprestimo;
	
	public Exemplar(String codMaterial, String codExemplar, String status) {
		this.codExemplar = codExemplar;
		this.codMaterial = codMaterial;
		this.status = status;
	}
	
	public String getCodMaterial() {
		return codMaterial;
	}
	public void setCodMaterial(String codMaterial) {
		this.codMaterial = codMaterial;
	}
	public String getCodEx() {
		return codExemplar;
	}
	public void setCodEx(String codEx) {
		this.codExemplar = codEx;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setEmprestimo(Emprestimo e){
		this.emprestimo = e;
	}
	
	public String getUserName(){
		return this.emprestimo.getUsrName();
	}
}
