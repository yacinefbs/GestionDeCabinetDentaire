package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionCabinetDentaire.www.entities.Ordonance;

public class OrdonanceDaoImpl implements IOrdonanceDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Ordonance ajouterOrdonance(Ordonance o) {
		// TODO Auto-generated method stub
		em.persist(o);
		return o;
	}

	@Override
	public Ordonance modifierOrdonance(Ordonance o) {
		// TODO Auto-generated method stub
		return em.merge(o);
	}

	@Override
	public void supprimerOrdonance(Long idOrdonance) {
		// TODO Auto-generated method stub
		Ordonance o = new Ordonance();
		o = em.find(Ordonance.class, idOrdonance);
		em.remove(o);
	}

	@Override
	public Ordonance findOrdonanceById(Long idOrdonance) {
		// TODO Auto-generated method stub
		return em.find(Ordonance.class, idOrdonance);
	}

	@Override
	public List<Ordonance> findAllOrdonance() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select o from Ordonance o");
		return req.getResultList();
	}

}
