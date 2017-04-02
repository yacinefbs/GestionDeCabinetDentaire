package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionCabinetDentaire.www.entities.Dossier;

public class DossierDaoImpl implements IDossierDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Dossier ajouterDossier(Dossier d) {
		// TODO Auto-generated method stub
		em.persist(d);
		return d;
	}

	@Override
	public Dossier modifierDossier(Dossier d) {
		// TODO Auto-generated method stub
		return em.merge(d);
	}

	@Override
	public void supprimerDossier(Long idDossier) {
		// TODO Auto-generated method stub
		Dossier d = new Dossier();
		d = em.find(Dossier.class, idDossier);
		em.remove(d);
	}

	@Override
	public Dossier findDossierById(Long idDossier) {
		// TODO Auto-generated method stub
		return em.find(Dossier.class, idDossier);
	}

	@Override
	public List<Dossier> findAllDossier() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select d from Dossier d");
		return req.getResultList();
	}
	
	@Override
	public List<Dossier> findDossiersByPatientID(Long idPatient) {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select d from Dossier d where idPatient=" + idPatient);
		return req.getResultList();
	}

}
