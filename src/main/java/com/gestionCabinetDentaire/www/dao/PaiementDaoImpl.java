package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionCabinetDentaire.www.entities.Paiement;

public class PaiementDaoImpl implements IPaiementDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Paiement ajouterpaiement(Paiement p) {
		// TODO Auto-generated method stub
		em.persist(p);
		return p;
	}

	@Override
	public Paiement modifierpaiement(Paiement p) {
		// TODO Auto-generated method stub
		return em.merge(p);
	}

	@Override
	public void supprimerpaiement(Long idPaiement) {
		// TODO Auto-generated method stub
		Paiement p = new Paiement();
		p = em.find(Paiement.class, idPaiement);
		em.remove(p);
	}

	@Override
	public Paiement findpaiementById(Long idPaiement) {
		// TODO Auto-generated method stub
		return em.find(Paiement.class, idPaiement);
	}

	@Override
	public List<Paiement> findAllPaiement() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select p from Paiement p");
		return req.getResultList();
	}
}
