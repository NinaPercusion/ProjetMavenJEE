package com.vazquez.departement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Departement {
	
	@Id
	private String idDepartement;
	@Column
	private String nomDepartement;
	@Column
	private String CodeRegion;
	@Column
	private String NomRegion;
	
	
	//Constructeurs 
	public Departement() {
		super();
	}
	
	
	
	public Departement(String idDepartement, String nomDepartement, String codeRegion, String nomRegion) {
		super();
		this.idDepartement = idDepartement;
		this.nomDepartement = nomDepartement;
		CodeRegion = codeRegion;
		NomRegion = nomRegion;
	}



	public String getIdDepartement() {
		return idDepartement;
	}
	public void setIdDepartement(String idDepartement) {
		this.idDepartement = idDepartement;
	}
	public String getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
	public String getCodeRegion() {
		return CodeRegion;
	}
	public void setCodeRegion(String codeRegion) {
		CodeRegion = codeRegion;
	}
	public String getNomRegion() {
		return NomRegion;
	}
	public void setNomRegion(String nomRegion) {
		NomRegion = nomRegion;
	}
	
	

}
