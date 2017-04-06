package com.gestionCabinetDentaire.www.models;

import java.util.Collection;

import com.gestionCabinetDentaire.www.entities.Dossier;

public class DossierForm {
	
	
	private Dossier dossier;
	private Collection<Dossier> dossiers;
	public Dossier getDossier() {
		return dossier;
	}
	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}
	public Collection<Dossier> getDossiers() {
		return dossiers;
	}
	public void setDossiers(Collection<Dossier> dossiers) {
		this.dossiers = dossiers;
	}
}
