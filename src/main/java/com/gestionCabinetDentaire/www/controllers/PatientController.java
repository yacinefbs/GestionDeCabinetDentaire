package com.gestionCabinetDentaire.www.controllers;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gestionCabinetDentaire.www.models.PatientForm;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PatientController {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
	
	
	@RequestMapping(value="/patient/savePatient")
	public String ajouterPatient(@Valid PatientForm pf, BindingResult bindingResult, Model model){
		System.out.println("nom : " + pf.getPatient().getNom());
		return "/patient/ajouterPatient";
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
