package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionCabinetDentaire.www.entities.Secretaire;

public class SecretaireDaoImpl implements ISecretaireDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Secretaire ajouterSecretaire(Secretaire s) {
		// TODO Auto-generated method stub
		em.persist(s);
		return s;
	}

	@Override
	public Secretaire modifierSecretaire(Secretaire s) {
		// TODO Auto-generated method stub
		return em.merge(s);
	}

	@Override
	public void supprimerSecretaire(Long idSecretaire) {
		// TODO Auto-generated method stub
		Secretaire s = new Secretaire();
		s = em.find(Secretaire.class, idSecretaire);
	}

	@Override
	public Secretaire findSecretaireById(Long idSecretaire) {
		// TODO Auto-generated method stub
		return em.find(Secretaire.class, idSecretaire);
	}

	@Override
	public List<Secretaire> findAllSecretaire() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select s from Secretaire s");
		return req.getResultList();
	}

}
