package com.gestionCabinetDentaire.www.controllers;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionCabinetDentaire.www.entities.Medecin;
import com.gestionCabinetDentaire.www.metier.IMedecinMetier;
import com.gestionCabinetDentaire.www.metier.IPatientMetier;
import com.gestionCabinetDentaire.www.metier.IRdvMetier;
import com.gestionCabinetDentaire.www.metier.MedecinMetierImpl;
import com.gestionCabinetDentaire.www.metier.PatientMetierImpl;
import com.gestionCabinetDentaire.www.metier.RdvMetierImpl;
import com.gestionCabinetDentaire.www.models.PatientForm;
import com.gestionCabinetDentaire.www.models.RdvForm;

@Controller
public class RdvController {
	
	private static final Logger logger = LoggerFactory.getLogger(RdvController.class);
	
	
	@Autowired
	private IMedecinMetier metierMedecin = new MedecinMetierImpl();
	@Autowired
	private IPatientMetier metierPatient = new PatientMetierImpl();
	@Autowired
	private IRdvMetier metierRdv = new RdvMetierImpl();
	
	@RequestMapping(value="/ajouterRdvForm")
	public String ajouterRdvForm(Model model){
		
//		if(bindingResult.hasErrors()){
//			return "ajouterPatient";
//		}
		
		RdvForm rdvForm = new RdvForm();
		rdvForm.setMedecins(metierMedecin.findAllMedecin());
		rdvForm.setPatients(metierPatient.findAllPatients());
		System.out.println("nbr medecins = "+rdvForm.getMedecins().size());
		
		for (Medecin m : metierMedecin.findAllMedecin()) {
			System.out.println("username : " + m.getUsername());
			System.out.println("nom : " + m.getNom());
		}
		
		model.addAttribute("rdvForm", rdvForm);
		
		return "ajouterRdv";
	}
	
	
	@RequestMapping(value="/ajouterRdv")
	public String ajouterRdv(@Valid RdvForm rf, BindingResult bindingResult, Model model){
		
		metierRdv.ajouterRdv(rf.getRdv());
		System.out.println("Ce rdv a été ajouté avec succès !!!");
		rf = new RdvForm();
		model.addAttribute("rdvForm", rf);
		return "ajouterRdv";
	}

}
