package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.IVisiteDao;
import com.gestionCabinetDentaire.www.dao.VisiteDaoImpl;
import com.gestionCabinetDentaire.www.entities.Visite;

@Transactional
public class VisiteMetierImpl implements IVisiteMetier {

	private IVisiteDao daoVisite = new VisiteDaoImpl();
	
	
	
	public void setDaoVisite(IVisiteDao daoVisite) {
		this.daoVisite = daoVisite;
	}

	@Override
	public Visite ajouterVisite(Visite v) {
		// TODO Auto-generated method stub
		return daoVisite.ajouterVisite(v);
	}

	@Override
	public Visite modifierVisite(Visite v) {
		// TODO Auto-generated method stub
		return daoVisite.modifierVisite(v);
	}

	@Override
	public void supprimerVisite(Long idVisite) {
		// TODO Auto-generated method stub
		daoVisite.supprimerVisite(idVisite);
	}

	@Override
	public Visite findVisiteById(Long idVisite) {
		// TODO Auto-generated method stub
		return daoVisite.findVisiteById(idVisite);
	}

	@Override
	public List<Visite> findAllVisite() {
		// TODO Auto-generated method stub
		return daoVisite.findAllVisite();
	}

}
