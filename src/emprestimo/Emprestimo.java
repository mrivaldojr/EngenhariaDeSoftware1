package emprestimo;

import java.util.Calendar;
import java.util.Date;

import material.Exemplar;
import usuario.Usuario;

public class Emprestimo {
	
	private Usuario usuario;
	private Exemplar exemplar;
	private int dias;
	private Date dataDev;
	private String status;
	
	public Emprestimo(Usuario usr, Exemplar exemplar, int dias) {		
		this.usuario = usr;
		this.exemplar = exemplar;
		this.dias = dias;
		this.status = "Ativo";
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Exemplar getExemplar() {
		return exemplar;
	}
	public void setExemplar(Exemplar exemplar) {
		this.exemplar = exemplar;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public Date getDataDev() {
		return dataDev;
	}
	
	
	
	public void setDataDev(int dias){
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, dias);
		dataDev = c.getTime();
		
		//dataDev.add(Calendar.DAY_OF_MONTH, dias);
		System.out.println(dataDev);
	}
	
	public String getUsrName(){
		return this.usuario.getNome();
	}
	
	public String getMaterialCod(){
		return this.exemplar.getCodMaterial();
	}

	public void devolveExemplar(Exemplar e){
		e.setStatus("Disponível");
	}
	
	public String getTituloMaterial(){
		return this.getExemplar().getNomeMaterial();
	}
	
	public String tipoMaterial(){
		return exemplar.getTipoMaterial();
	}
}
