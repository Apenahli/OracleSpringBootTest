package com.example.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@OneToMany(mappedBy = "department")
	private List<Employee> employees;
	
	
	@OneToMany(mappedBy = "department")
	private List<Location> locations;

	public Department() {

	}
	
	// ardiyca getter setter taz ve to string yaz amma to stringde ( private Department department;) bu hisseni cagirma
	
}
