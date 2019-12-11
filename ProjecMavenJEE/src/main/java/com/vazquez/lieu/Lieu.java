package com.vazquez.lieu;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Lieu {
	
	@Id
	private String CodeINSEE;
	@Column
	private String codePosta;
	@Column
	private String commune;
	@Column
	private String departement;
	@Column
	private String latitud;
	@Column
	private String longitud;
	@Column
	private String region;
	
	//constructeur 
	public Lieu() {
		super();
	}
	//constructeur des variables
	public Lieu(String codeINSEE, String codePosta, String commune, String departement, String latitud, String longitud,
			String region) {
		super();
		CodeINSEE = codeINSEE;
		this.codePosta = codePosta;
		this.commune = commune;
		this.departement = departement;
		this.latitud = latitud;
		this.longitud = longitud;
		this.region = region;
	}
	
	public String getCodeINSEE() {
		return CodeINSEE;
	}
	
	public void setCodeINSEE(String codeINSEE) {
		CodeINSEE = codeINSEE;
	}
	public String getCodePosta() {
		return codePosta;
	}
	public void setCodePosta(String codePosta) {
		this.codePosta = codePosta;
	}
	public String getCommune() {
		return commune;
	}
	public void setCommune(String commune) {
		this.commune = commune;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public String getLatitud() {
		return latitud;
	}
	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}
	public String getLongitud() {
		return longitud;
	}
	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}

}
