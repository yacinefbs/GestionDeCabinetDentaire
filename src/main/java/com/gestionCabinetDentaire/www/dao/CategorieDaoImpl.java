package com.gestionCabinetDentaire.www.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.gestionCabinetDentaire.www.entities.Categorie;

public class CategorieDaoImpl implements ICategorieDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Categorie ajouterCategorie(Categorie c) {
		// TODO Auto-generated method stub
		em.persist(c);
		return c;
	}
	
}
