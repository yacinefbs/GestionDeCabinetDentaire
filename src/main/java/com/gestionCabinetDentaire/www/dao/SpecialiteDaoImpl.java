package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionCabinetDentaire.www.entities.Specialite;

public class SpecialiteDaoImpl implements ISpecialiteDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Specialite ajouterSpecialite(Specialite s) {
		// TODO Auto-generated method stub
		em.persist(s);
		return s;
	}

	@Override
	public Specialite modifierSpecialite(Specialite s) {
		// TODO Auto-generated method stub	
		return em.merge(s);
	}

	@Override
	public void supprimerSpecialite(Long idSpecialite) {
		// TODO Auto-generated method stub
		Specialite s = new Specialite();
		s = em.find(Specialite.class, idSpecialite);
		em.remove(s);
	}

	@Override
	public Specialite findSpecialiteById(Long idSpecialite) {
		// TODO Auto-generated method stub
		return em.find(Specialite.class, idSpecialite);
	}

	@Override
	public List<Specialite> findAllSpecialite() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select s from Specialite s");
		return req.getResultList();
	}

}
