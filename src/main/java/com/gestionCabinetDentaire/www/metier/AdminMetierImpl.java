package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.gestionCabinetDentaire.www.dao.AdminDaoImpl;
import com.gestionCabinetDentaire.www.dao.IAdminDao;
import com.gestionCabinetDentaire.www.entities.Admin;

@Transactional
public class AdminMetierImpl implements IAdminMetier {

	private IAdminDao daoAdmin = new AdminDaoImpl();
	
	public void setDaoAdmin(IAdminDao daoAdmin) {
		this.daoAdmin = daoAdmin;
	}

	@Override
	public Admin ajouterAdmin(Admin d) {
		// TODO Auto-generated method stub
		return daoAdmin.ajouterAdmin(d);
	}

	@Override
	public Admin modifierAdmin(Admin d) {
		// TODO Auto-generated method stub
		return daoAdmin.modifierAdmin(d);
	}

	@Override
	public void supprimerAdmin(Long idAdmin) {
		// TODO Auto-generated method stub
		daoAdmin.supprimerAdmin(idAdmin);
	}

	@Override
	public Admin findAdminById(Long idAdmin) {
		// TODO Auto-generated method stub
		return daoAdmin.findAdminById(idAdmin);
	}

	@Override
	public List<Admin> findAllAdmin() {
		// TODO Auto-generated method stub
		return daoAdmin.findAllAdmin();
	}

}
