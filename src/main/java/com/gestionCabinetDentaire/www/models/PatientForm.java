package com.gestionCabinetDentaire.www.models;

import javax.validation.constraints.Size;

import com.gestionCabinetDentaire.www.entities.Patient;

public class PatientForm {
	private Patient patient;
	
	@Size(min=3, max=6)
	private String sexe;

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
}	
