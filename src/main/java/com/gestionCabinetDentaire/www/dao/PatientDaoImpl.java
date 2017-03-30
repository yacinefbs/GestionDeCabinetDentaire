package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionCabinetDentaire.www.entities.Patient;

public class PatientDaoImpl implements IPatientDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Patient ajouterPatient(Patient p) {
		// TODO Auto-generated method stub
		System.out.println("objet patient : ");
		System.out.println(p.getIdPersonne());
		System.out.println(p.getNom());
		System.out.println(p.getPrenom());
		System.out.println(p.getProfession());
		System.out.println(p.getDateNaissance());
		System.out.println("col dossiers : " + p.getDossiers().size());
		System.out.println("col rdv :" + p.getRdvs().size());
		System.out.println(p.getCin());
		System.out.println(p.getTel());
		System.out.println(p.getAdresse());
		System.out.println(p.getVille());
		System.out.println(p.getEmail());
		System.out.println("col dossiers : " + p.getDossiers().size());
		System.out.println("col rdv :" + p.getRdvs().size());

		em.persist(p);
		return p;
	}

	@Override
	public Patient modifierPatient(Patient p) {
		// TODO Auto-generated method stub
		return em.merge(p);
	}

	@Override
	public void supprimerPatient(Patient p) {
		// TODO Auto-generated method stub
		em.remove(p);
	}

	@Override
	public Patient findPatientById(Long idPatient) {
		// TODO Auto-generated method stub
		Patient p = em.find(Patient.class, idPatient);
		return p;
	}

	@Override
	public List<Patient> findAllPatients() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select p from Patient p");
		return req.getResultList();
	}
}
