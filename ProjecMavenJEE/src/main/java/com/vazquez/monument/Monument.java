package com.vazquez.monument;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "monument")
public class Monument implements Serializable {

	private static final long serialVersionUID = 1L;

	// constructeur vide
	public Monument() {

	}

	// constructeur de variables
	public Monument(String codigoMonument, String regionMonumento, String codeDepartement, String commune,
			String titreCourant, String statusPropiete) {
		this.codigoMonument = codigoMonument;
		this.regionMonument = regionMonumento;
		this.codeDepartement = codeDepartement;
		Commune = commune;
		this.titreCourant = titreCourant;
		this.statusPropiete = statusPropiete;
	}

	@Id
	@Column(name = "codigoMonument")
	private String codigoMonument;

	@Column(name = "regionMonument")
	private String regionMonument;

	@Column(name = "codeDepartament")
	private String codeDepartement;

	@Column(name = "commune")
	private String Commune;

	@Column(name = "titreCourant")
	private String titreCourant;

	@Column(name = "ztatusPropiete")
	private String statusPropiete;
	/////////////////////////////////////////////////////////////////////////////////////////////////////////

	// c'est pour imprimer l'objet avec ses attributs

	public String getCodigoMonument() {
		return codigoMonument;
	}

	public void setCodigoMonument(String codigoMonument) {
		this.codigoMonument = codigoMonument;
	}

	public String getRegionMonument() {
		return regionMonument;
	}

	public void setRegionMonument(String regionMonument) {
		this.regionMonument = regionMonument;
	}

	public String getCodeDepartement() {
		return codeDepartement;
	}

	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	public String getCommune() {
		return Commune;
	}

	public void setCommune(String commune) {
		Commune = commune;
	}

	public String getTitreCourant() {
		return titreCourant;
	}

	public void setTitreCourant(String titreCourant) {
		this.titreCourant = titreCourant;
	}

	public String getStatusPropiete() {
		return statusPropiete;
	}

	public void setStatusPropiete(String statusPropiete) {
		this.statusPropiete = statusPropiete;
	}

	@Override
	public String toString() {
		return "Monument [codigoMonument=" + codigoMonument + ", regionMonument=" + regionMonument
				+ ", codeDepartement=" + codeDepartement + ", Commune=" + Commune + ", titreCourant=" + titreCourant
				+ ", statusPropiete=" + statusPropiete + "]";
	}
}
