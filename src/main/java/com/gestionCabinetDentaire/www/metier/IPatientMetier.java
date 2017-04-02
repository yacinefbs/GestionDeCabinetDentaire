package com.gestionCabinetDentaire.www.metier;

import java.util.Collection;
import java.util.List;

import com.gestionCabinetDentaire.www.entities.Patient;

public interface IPatientMetier {
	public Patient ajouterPatient(Patient p);
	public Patient modifierPatient(Patient p);
	public void supprimerPatient(Patient p);
	public Patient findPatientById(Long idPatient);
	public Collection<Patient> findAllPatients();
}
