package com.vazquez.dao;

import javax.persistence.EntityManager;
import com.vazquez.monument.JPAOutil;
import com.vazquez.monument.Monument;
import javax.persistence.*;
public class MonumentDAO {
	
	EntityManager entiity = JPAOutil.getEntityManagerFactory().createEntityMAnager(); 
	
	
	//on pase juste l'objet pour sauvegarder dans la BD
	//hibernate fait le mapping de chaque columne ;) 
	public void sauvegarderMonument(Monument monument) {
		entity.getTransaction().begin();
		entity.persist(monument);
		//commit, ferme la transaction et sauvegarde dans la bd
		entity.getTransaction().commit();
		//on ferme la connexion 
		JPAOutil.shutdown();
	}
	
	//methode pour editer 
	public void editMonument(Monument monument) {
		entity.getTransaction().begin();
		//merge prends un objet comme parametre
		//hibernate cherche dans la BD un registre que soit le meme que mon variable en general pour l'id 
		entity.merge(monument);
		//commit, ferme la transaction et sauvegarde dans la bd
		entity.getTransaction().commit();
		//on ferme la connexion a la BD
		JPAOutil.shutdown();		
	}
	
	//methode chercher 1 registre 
	public Monument chercher(String id) {
		Monument m= new Monument();
		//Trouver un registre dans la BD 
		m=entity.find(Monument.class, id);
		//on ferme la connexion a la BD
		JPAOutil.shutdown();
		//on returne l'objet de type Monument
		return m;		
	}
	
	//methode chercher tous les registres et les envoie dans un liste 
	public List<Monument> chercherTousMonument() {
		List<Monument> ltsMonument = new ArrayList<>();
		//JQL 
		Query query = entity.createQuery("SELECT m FROM Monument m");
		lstMonument= query.getResultList();
		return lstMonument;
	}

}
