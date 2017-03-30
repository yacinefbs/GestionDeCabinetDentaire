package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionCabinetDentaire.www.entities.Infirmier;

public class InfirmierDaoImpl implements IInfirmierDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Infirmier ajouterInfirmier(Infirmier i) {
		// TODO Auto-generated method stub
		em.persist(i);
		return i;
	}

	@Override
	public Infirmier modifierInfirmier(Infirmier i) {
		// TODO Auto-generated method stub
		return em.merge(i);
	}

	@Override
	public void supprimerInfirmier(Long idInfirmier) {
		// TODO Auto-generated method stub
		Infirmier i = new Infirmier();
		em.remove(i);
	}

	@Override
	public Infirmier findInfirmierById(Long idInfirmier) {
		// TODO Auto-generated method stub
		return em.find(Infirmier.class, idInfirmier);
	}

	@Override
	public List<Infirmier> findAllInfirmier() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select i from Infirmier i");
		return req.getResultList();
	}

}
