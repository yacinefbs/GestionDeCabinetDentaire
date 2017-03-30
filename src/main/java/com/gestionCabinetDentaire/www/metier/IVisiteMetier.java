package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Visite;

public interface IVisiteMetier {
	public Visite ajouterVisite(Visite v);
	public Visite modifierVisite(Visite v);
	public void supprimerVisite(Long idVisite);
	public Visite findVisiteById(Long idVisite);
	public List<Visite> findAllVisite();
}
