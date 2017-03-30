package com.gestionCabinetDentaire.www.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue("patient")
public class Patient extends Personne implements Serializable {

	
	@OneToMany(mappedBy="patient", fetch=FetchType.LAZY)
	private Collection<Dossier> dossiers = null;

	@OneToMany(mappedBy="patient", fetch=FetchType.LAZY)
	private Collection<Rdv> rdvs = null;
	
	public Collection<Dossier> getDossiers() {
		return dossiers;
	}

	public void setDossiers(Collection<Dossier> dossiers) {
		this.dossiers = dossiers;
	}

	public Collection<Rdv> getRdvs() {
		return rdvs;
	}

	public void setRdvs(Collection<Rdv> rdvs) {
		this.rdvs = rdvs;
	}
}
