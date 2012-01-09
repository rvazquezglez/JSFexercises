package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="homeController")
@RequestScoped
public class HomeController {
	public String verDetalle(){
		return "bookDetail";
	}
}
