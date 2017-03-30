package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Specialite;

public interface ISpecialiteMetier {
	public Specialite ajouterSpecialite(Specialite s);
	public Specialite modifierSpecialite(Specialite s);
	public void supprimerSpecialite(Long idSpecialite);
	public Specialite findSpecialiteById(Long idSpecialite);
	public List<Specialite> findAllSpecialite();
}
