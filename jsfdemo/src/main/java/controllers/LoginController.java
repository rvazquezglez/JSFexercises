package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import domain.classes.Usuario;

@ManagedBean(name="loginController")
@RequestScoped
public class LoginController {
	
	@ManagedProperty(value="#{lguser}")
	private Usuario usuario;

	public String verificaUsuario(){
		if(usuario.getNombre().equals("raul") 
				&& usuario.getContrasenia().equals("raul")){
			return "validUser";
		} else{
			return "invalidUser";
		}
	}
	
	public String verDetalle(){
		return "bookDetail";
	}
	public String verHome(){
		return "home";
	}
	public String verLogin(){
		return "login";
	}

	public Usuario getUsuario() {
		return usuario;
	}



	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}



	public String getNombre() {
		return usuario.getNombre();
	}
	public void setNombre(String nombre) {
		this.usuario.setNombre(nombre);
	}
	public String getContrasenia() {
		return usuario.getContrasenia();
	}
	public void setContrasenia(String contrasenia) {
		this.usuario.setContrasenia(contrasenia);
	}
	
	
}
