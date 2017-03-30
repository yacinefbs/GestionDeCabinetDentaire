package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionCabinetDentaire.www.entities.Medecin;

public class MedecinDaoImpl implements IMedecinDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Medecin ajouterMedecin(Medecin m) {
		// TODO Auto-generated method stub
		em.persist(m);
		return m;
	}

	@Override
	public Medecin modifierMedecin(Medecin m) {
		// TODO Auto-generated method stub
		return em.merge(m);
	}

	@Override
	public void supprimerMedecin(Long idMedecin) {
		// TODO Auto-generated method stub
		Medecin m = new Medecin();
		m = em.find(Medecin.class, idMedecin);
		em.remove(m);
	}

	@Override
	public Medecin findMedecinById(Long idMedecin) {
		// TODO Auto-generated method stub
		return em.find(Medecin.class, idMedecin);
	}

	@Override
	public List<Medecin> findAllMedecin() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select m from Medecin m");
		return req.getResultList();
	}

}
