package reserva;

import usuario.Usuario;
import material.Material;

public class Reserva {

	private Material material;
	private Usuario usuario;
	
	public Reserva(Usuario usuario, Material material) {
		this.material = material;
		this.usuario = usuario;
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
	
	
}
