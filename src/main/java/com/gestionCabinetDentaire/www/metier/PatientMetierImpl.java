package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.IPatientDao;
import com.gestionCabinetDentaire.www.dao.PatientDaoImpl;
import com.gestionCabinetDentaire.www.entities.Patient;


@Transactional
public class PatientMetierImpl implements IPatientMetier {

	
	private IPatientDao daoPatient = new PatientDaoImpl();
	
	
	public void setDaoPatient(IPatientDao daoPatient) {
		this.daoPatient = daoPatient;
	}

	@Override
	public Patient ajouterPatient(Patient p) {
		// TODO Auto-generated method stub
		return daoPatient.ajouterPatient(p);
	}

	@Override
	public Patient modifierPatient(Patient p) {
		// TODO Auto-generated method stub
		return daoPatient.modifierPatient(p);
	}

	@Override
	public void supprimerPatient(Patient p) {
		// TODO Auto-generated method stub
		daoPatient.supprimerPatient(p);
	}

	@Override
	public Patient findPatientById(Long idPatient) {
		// TODO Auto-generated method stub
		return daoPatient.findPatientById(idPatient);
	}

	@Override
	public List<Patient> findAllPatients() {
		// TODO Auto-generated method stub
		return daoPatient.findAllPatients();
	}
}
