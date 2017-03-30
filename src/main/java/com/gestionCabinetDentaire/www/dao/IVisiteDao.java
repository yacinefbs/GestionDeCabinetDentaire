package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Visite;

public interface IVisiteDao {
	public Visite ajouterVisite(Visite v);
	public Visite modifierVisite(Visite v);
	public void supprimerVisite(Long idVisite);
	public Visite findVisiteById(Long idVisite);
	public List<Visite> findAllVisite();
}
