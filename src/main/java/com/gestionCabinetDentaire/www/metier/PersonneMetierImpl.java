package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.IPersonneDao;
import com.gestionCabinetDentaire.www.dao.PersonneDaoImpl;
import com.gestionCabinetDentaire.www.entities.Admin;

@Transactional
public class PersonneMetierImpl implements IPersonneMetier {

	private IPersonneDao daoPersonne = new PersonneDaoImpl();
	
	
	
	public void setDaoPersonne(IPersonneDao daoPersonne) {
		this.daoPersonne = daoPersonne;
	}

	@Override
	public Admin ajouterAdmin(Admin d) {
		// TODO Auto-generated method stub
		return daoPersonne.ajouterAdmin(d);
	}

	@Override
	public Admin modifierAdmin(Admin d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerAdmin(Long idAdmin) {
		// TODO Auto-generated method stub

	}

	@Override
	public Admin findAdminById(Long idAdmin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> findAllAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

}
