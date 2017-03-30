package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Rdv;

public interface IRdvDao {
	public Rdv ajouterRdv(Rdv r);
	public Rdv modifierRdv(Rdv r);
	public void supprimerRdv(Long idRdv);
	public Rdv findRdvById(Long idRdv);
	public List<Rdv> findAllRdv();
}
