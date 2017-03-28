package com.gestionCabinetDentaire.www.controllers;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gestionCabinetDentaire.www.entities.Categorie;
import com.gestionCabinetDentaire.www.metier.CategorieMetierImpl;
import com.gestionCabinetDentaire.www.metier.ICategorieMetier;

/**
 * Handles requests for the application home page.
 */
@Controller
public class PatientController {
	
	private static final Logger logger = LoggerFactory.getLogger(PatientController.class);
	
	
	@RequestMapping(value="/patient/ajouterPatient")
	public String ajouterPatient(){
		return "/patient/ajouterPatient";
	}
	
	@RequestMapping(value="/patient/ajouterPatient2")
	public String ajouterPatient2(){
		return "/patient/ajouterPatient2";
	}
	
}
