package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Ordonance;

public interface IOrdonanceDao {
	public Ordonance ajouterOrdonance(Ordonance o);
	public Ordonance modifierOrdonance(Ordonance o);
	public void supprimerOrdonance(Long idOrdonance);
	public Ordonance findOrdonanceById(Long idOrdonance);
	public List<Ordonance> findAllOrdonance();
}
