package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.gestionCabinetDentaire.www.entities.Admin;

public class PersonneDaoImpl implements IPersonneDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Admin ajouterAdmin(Admin d) {
		// TODO Auto-generated method stub
		em.persist(d);
		return d;
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
