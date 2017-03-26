package com.gestionCabinetDentaire.www.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Visite implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idVisite;
	private String dateDebut;
	private String dateFin;
	private String typeVisite;
	private int nbrVisiteEffectuer;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="idOrdonance")
	private Ordonance ordonance;
	
	@OneToMany(mappedBy="visite", fetch=FetchType.LAZY)
	private Collection<Paiement> paiements;

	public Visite() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Visite(String dateDebut, String dateFin, String typeVisite, int nbrVisiteEffectuer) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.typeVisite = typeVisite;
		this.nbrVisiteEffectuer = nbrVisiteEffectuer;
	}

	public Long getIdVisite() {
		return idVisite;
	}

	public void setIdVisite(Long idVisite) {
		this.idVisite = idVisite;
	}

	public String getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(String dateDebut) {
		this.dateDebut = dateDebut;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

	public String getTypeVisite() {
		return typeVisite;
	}

	public void setTypeVisite(String typeVisite) {
		this.typeVisite = typeVisite;
	}

	public int getNbrVisiteEffectuer() {
		return nbrVisiteEffectuer;
	}

	public void setNbrVisiteEffectuer(int nbrVisiteEffectuer) {
		this.nbrVisiteEffectuer = nbrVisiteEffectuer;
	}

	public Ordonance getOrdonance() {
		return ordonance;
	}

	public void setOrdonance(Ordonance ordonance) {
		this.ordonance = ordonance;
	}
}
