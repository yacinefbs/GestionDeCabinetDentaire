package com.gestionCabinetDentaire.www.models;

import java.util.Collection;

import com.gestionCabinetDentaire.www.entities.Medecin;
import com.gestionCabinetDentaire.www.entities.Patient;
import com.gestionCabinetDentaire.www.entities.Rdv;

public class RdvForm {
	private Rdv rdv;
	private Collection<Rdv> rdvs;
	private Collection<Medecin> medecins;
	private Collection<Patient> patients;
	
	public Rdv getRdv() {
		return rdv;
	}
	public void setRdv(Rdv rdv) {
		this.rdv = rdv;
	}
	public Collection<Rdv> getRdvs() {
		return rdvs;
	}
	public void setRdvs(Collection<Rdv> rdvs) {
		this.rdvs = rdvs;
	}
	public Collection<Medecin> getMedecins() {
		return medecins;
	}
	public void setMedecins(Collection<Medecin> medecins) {
		this.medecins = medecins;
	}
	public Collection<Patient> getPatients() {
		return patients;
	}
	public void setPatients(Collection<Patient> patients) {
		this.patients = patients;
	}
	
}
