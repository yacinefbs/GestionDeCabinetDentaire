package com.gestionCabinetDentaire.www.controllers;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionCabinetDentaire.www.metier.IPatientMetier;
import com.gestionCabinetDentaire.www.metier.PatientMetierImpl;
import com.gestionCabinetDentaire.www.models.PatientForm;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PatientController {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
	
	@Autowired
	private IPatientMetier metierPatient = new PatientMetierImpl();
	
	@RequestMapping(value="patient/ajouterPatient")
	public String ajouterPatient(@Valid PatientForm pf, BindingResult bindingResult, Model model){
		System.out.println("nom : " + pf.getPatient().getNom());
		pf.getPatient().setDossiers(null);
		pf.getPatient().setRdvs(null);
		pf.getPatient().setNumAssurance(0);
		metierPatient.ajouterPatient(pf.getPatient());
		System.out.println("Ajout avec succès !!!");
		return "/patient/ajouterPatient2";
	}
	
	@RequestMapping(value="/patient/ajouterPatient2")
	public String ajouterPatient2(@Valid PatientForm pf, BindingResult bindingResult, Model model){
		
		if(bindingResult.hasErrors()){
			return "/patient/ajouterPatient2";
		}
		
		PatientForm patientForm = new PatientForm();
		model.addAttribute("patientForm", patientForm);
		return "/patient/ajouterPatient2";
	}
	
}
