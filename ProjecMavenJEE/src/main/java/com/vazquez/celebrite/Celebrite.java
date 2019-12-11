package com.vazquez.celebrite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Celebrite {
	
	@Id
	private String numCelebrite;
	@Column
	private String nom;
	@Column
	private String prenom;
	@Column
	private String nationalite;
	@Column
	private String epoque;
	
	
	//Constructeur
	public Celebrite() {
		super();
	}


	public Celebrite(String numCelebrite, String nom, String prenom, String nationalite, String epoque) {
		super();
		this.numCelebrite = numCelebrite;
		this.nom = nom;
		this.prenom = prenom;
		this.nationalite = nationalite;
		this.epoque = epoque;
	}


	public String getNumCelebrite() {
		return numCelebrite;
	}


	public void setNumCelebrite(String numCelebrite) {
		this.numCelebrite = numCelebrite;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getNationalite() {
		return nationalite;
	}


	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}


	public String getEpoque() {
		return epoque;
	}


	public void setEpoque(String epoque) {
		this.epoque = epoque;
	}
	
	

}
