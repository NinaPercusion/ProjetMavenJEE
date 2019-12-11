package com.vazquez.tests;

import com.vazquez.monument.Monument;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


public class TestMonunent {

	@PersistenceContext(unitName = "PERSISTENCE" )
	private static EntityManager manager; 
	
	public void insertMonument() {
		Monument monumInsert = new Monument("PARLETHP","Occitanie","34","Herault","ESTATUA", "privée");
		//transaction inicializada
		manager.getTransaction().begin();
		//
		manager.persist(monumInsert);
		//sauvegarder
		manager.getTransaction().commit();
	

	}
	public void findIdMonument(String m) {
		//find une entité dans la table de la base de donnees touriste
		//Monument monumFind = manager.find(Monument.class, "PA00116310");
	
	}

	public void mergeMonument() {
		//update les donnees de la base 
		//manager.merge(monumFind);
		
	}
	
	public void deleteMonument() {
		//delete 
		//manager.remove(monumFind);
		
	}
	public List<Monument> findAllMonument() {
		//extraction de toutes les entités de la bd
		@SuppressWarnings("unchecked")
		List<Monument> lsMonument= (List<Monument>)manager.createQuery("SELECT m FROM Monument m ").getResultList();
		return lsMonument;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
