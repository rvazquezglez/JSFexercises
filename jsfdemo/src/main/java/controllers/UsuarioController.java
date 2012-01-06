package controllers;

import javax.faces.bean.ManagedProperty;

import domain.classes.Usuario;

public class UsuarioController {
	@ManagedProperty(value="usuario")
	private Usuario usuar;

	public Usuario getUsuar() {
		return usuar;
	}

	public void setUsuar(Usuario usuar) {
		this.usuar = usuar;
	}
	
	
}
