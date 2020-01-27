package com.example.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "dep_id")
	private Department department;
	
	@ManyToOne
	@JoinColumn(name = "pozition_id")
	private Pozition pozition;

	public Employee() {
	
	}
	
	// ardiyca getter setter taz ve to string yaz amma to stringde ( private Department department;) bu hisseni cagirma
	
	
}
