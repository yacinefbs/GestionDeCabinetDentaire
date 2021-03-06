package com.gestionCabinetDentaire.www.metier;

import java.util.List;

import com.gestionCabinetDentaire.www.entities.Admin;

public interface IAdminMetier {
	public Admin ajouterAdmin(Admin d);
	public Admin modifierAdmin(Admin d);
	public void supprimerAdmin(Long idAdmin);
	public Admin findAdminById(Long idAdmin);
	public List<Admin> findAllAdmin();
}
