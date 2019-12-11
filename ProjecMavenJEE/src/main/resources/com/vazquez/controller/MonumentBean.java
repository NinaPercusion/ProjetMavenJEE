package com.vazquez.controller;

import javax.faces.bean.ManagerBean;
import javax.faces.bean.RequestScoped;



@ManagerBean(name="monumentBean")
@RequestScoped
public class MonumentBean {
	public List<Monument>getMonument(){
		List<Cliente> lstMonument = new ArrayList<>();
		//simulation de monuments
		
		Monument m1 = new Monument();
		m1.setCodigoMonument("Prueba1");
		m1.setRegionMonumento("Arc du trionphe Montpellier");
		m1.setCodeDepartement("34");
		m1.setCommune("34")
		m1.setTitreCourant("Arc du trionphe Montpellier");
		m1.setStatusPropiete("etat");
		
		Monument m2 = new Monument();
		m2.setCodigoMonument("Prueba2");
		m2.setRegionMonumento("Ile de paris");
		m2.setCodeDepartement("75");
		m2.setCommune("75")
		m2.setTitreCourant("Tour Eiffel");
		m2.setStatusPropiete("etat");
		
		lstMonument.add(m2);
		return lstMonument;
	}

}
