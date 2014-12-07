package reserva;

import java.util.Date;

import material.Material;
import usuario.Usuario;

public class Reserva {

	private Material material;
	private Usuario usuario;
	private Date data;
	
	public Reserva(Usuario usuario, Material material, Date data) {
		this.material = material;
		this.usuario = usuario;
		this.data = data;
	}

	public Date getDate(){
		return this.data;
	}
	
	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void reservaMaterial(){
		this.material.addReserva(this);
	}
	
	public String getUserCod(){
		return this.getUsuario().getCodIdentificacao();
	}
	
	public void printaDadosReserva(){
		System.out.println("Reservado para: "+this.usuario.getNome());
	}
	public String getMatTitulo(){
		return this.material.getTitulo();
	}
	

}
