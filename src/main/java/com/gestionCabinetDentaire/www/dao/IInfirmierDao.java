package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Infirmier;

public interface IInfirmierDao {
	public Infirmier ajouterInfirmier(Infirmier d);
	public Infirmier modifierInfirmier(Infirmier d);
	public void supprimerInfirmier(Long idInfirmier);
	public Infirmier findInfirmierById(Long idInfirmier);
	public List<Infirmier> findAllInfirmier();
}
