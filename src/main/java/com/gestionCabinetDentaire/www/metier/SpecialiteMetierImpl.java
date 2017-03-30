package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.ISpecialiteDao;
import com.gestionCabinetDentaire.www.dao.SpecialiteDaoImpl;
import com.gestionCabinetDentaire.www.entities.Specialite;


@Transactional
public class SpecialiteMetierImpl implements ISpecialiteMetier {

	private ISpecialiteDao daoSpecialite = new SpecialiteDaoImpl();
	
	
	
	public void setDaoSpecialite(ISpecialiteDao daoSpecialite) {
		this.daoSpecialite = daoSpecialite;
	}

	@Override
	public Specialite ajouterSpecialite(Specialite s) {
		// TODO Auto-generated method stub
		return daoSpecialite.ajouterSpecialite(s);
	}

	@Override
	public Specialite modifierSpecialite(Specialite s) {
		// TODO Auto-generated method stub
		return daoSpecialite.modifierSpecialite(s);
	}

	@Override
	public void supprimerSpecialite(Long idSpecialite) {
		// TODO Auto-generated method stub
		daoSpecialite.supprimerSpecialite(idSpecialite);
	}

	@Override
	public Specialite findSpecialiteById(Long idSpecialite) {
		// TODO Auto-generated method stub
		return daoSpecialite.findSpecialiteById(idSpecialite);
	}

	@Override
	public List<Specialite> findAllSpecialite() {
		// TODO Auto-generated method stub
		return daoSpecialite.findAllSpecialite();
	}
}
