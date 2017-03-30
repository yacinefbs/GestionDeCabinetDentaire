package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionCabinetDentaire.www.entities.Visite;

public class VisiteDaoImpl implements IVisiteDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Visite ajouterVisite(Visite v) {
		// TODO Auto-generated method stub
		em.persist(v);
		return v;
	}

	@Override
	public Visite modifierVisite(Visite v) {
		// TODO Auto-generated method stub
		return em.merge(v);
	}

	@Override
	public void supprimerVisite(Long idVisite) {
		// TODO Auto-generated method stub
		Visite v = new Visite();
		v = em.find(Visite.class, idVisite);
		em.remove(v);
	}

	@Override
	public Visite findVisiteById(Long idVisite) {
		// TODO Auto-generated method stub
		return em.find(Visite.class, idVisite);
	}

	@Override
	public List<Visite> findAllVisite() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select v from Visite v");
		return req.getResultList();
	}

}
