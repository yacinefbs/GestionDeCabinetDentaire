package com.gestionCabinetDentaire.www.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DossierController {
	private static final Logger logger = LoggerFactory.getLogger(DossierController.class);
	
	
	@RequestMapping(value="/listeDossiers")
	public String listeDossiers(Model model){
		
		
		return "listeDossiers";
	}
	
}
