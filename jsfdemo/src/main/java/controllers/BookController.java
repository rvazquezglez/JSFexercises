package controllers;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="bookController")
@RequestScoped
public class BookController {
	public String verHome(){
		return "home";
	}
	
}
