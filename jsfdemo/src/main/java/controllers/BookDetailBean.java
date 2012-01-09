package controllers;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import domain.classes.Address;
import domain.classes.EmployeeDetails;

@ManagedBean(name="dataTableBean")
@RequestScoped
public class BookDetailBean {
	private String[] arr;
	private List<EmployeeDetails> list;

	public BookDetailBean() {
		arr = new String[3];
		arr[0] = "JSF";
		arr[1] = "Struts";
		arr[2] = "Spring";
		
		
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.setEmpNo(1);
		emp1.setEmpName("Employee : 1");
		Address adr1 = new Address();
		adr1.setCity("Bangalore");
		adr1.setCountry("India");
		adr1.setPincode(89745);
		adr1.setStreet("First Street");
		emp1.setEmpAddress(adr1);
		
		EmployeeDetails emp2 = new EmployeeDetails();
		emp2.setEmpNo(1);
		emp2.setEmpName("Employee : 2");
		Address adr2 = new Address();
		adr2.setCity("Chennai");
		adr2.setCountry("India");
		adr2.setPincode(235432);
		adr2.setStreet("First Street");
		emp2.setEmpAddress(adr2);
		
		list = new ArrayList<EmployeeDetails>();
		list.add(emp1);
		list.add(emp2);
	}

	public String[] getArr() {
		return arr;
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	public List<EmployeeDetails> getList() {
		return list;
	}

	public void setList(List<EmployeeDetails> list) {
		this.list = list;
	}
}