package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.entities.Rdv;


public class RdvDaoImpl implements IRdvDao {

	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Rdv ajouterRdv(Rdv r) {
		// TODO Auto-generated method stub
		em.persist(r);
		return r;
	}

	@Override
	public Rdv modifierRdv(Rdv r) {
		// TODO Auto-generated method stub
		return em.merge(r);
	}

	@Override
	public void supprimerRdv(Long idRdv) {
		// TODO Auto-generated method stub
		Rdv r = new Rdv();
		r = em.find(Rdv.class, idRdv);
		em.remove(r);
	}

	@Override
	public Rdv findRdvById(Long idRdv) {
		// TODO Auto-generated method stub
		return em.find(Rdv.class, idRdv);
	}

	@Override
	public List<Rdv> findAllRdv() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select r from Rdv r");
		return req.getResultList();
	}
	@Override
	public List<Rdv> findRdsByPatientID(Long idPatient) {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select r from Rdv r where idPatient=" + idPatient);
		return req.getResultList();
	}

}
