package com.oc.moko.oc_lade.api;

import com.oc.moko.oc_lade.model.Utilisateur;
import com.oc.moko.oc_lade.service.UtilisateurService;

public class UtilisateurController {

	private final UtilisateurService utilisateurService;

	public UtilisateurController(UtilisateurService utilisateurService) {
		this.utilisateurService = utilisateurService;
	}
	
	public void addUtilisateur(Utilisateur utilisateur) {
		utilisateurService.addUtilisateur(utilisateur);
	}
}
