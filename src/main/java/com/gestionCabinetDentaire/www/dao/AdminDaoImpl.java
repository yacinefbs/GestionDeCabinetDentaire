package com.gestionCabinetDentaire.www.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.gestionCabinetDentaire.www.entities.Admin;

public class AdminDaoImpl implements IAdminDao {

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
		return em.merge(d);
	}

	@Override
	public void supprimerAdmin(Long idAdmin) {
		// TODO Auto-generated method stub
		Admin a = new Admin();
		a = em.find(Admin.class, idAdmin);
		em.remove(a);
	}

	@Override
	public Admin findAdminById(Long idAdmin) {
		// TODO Auto-generated method stub
		return em.find(Admin.class, idAdmin);
	}

	@Override
	public List<Admin> findAllAdmin() {
		// TODO Auto-generated method stub
		Query req = em.createQuery("select a from Admin a");
		return req.getResultList();
	}

}
