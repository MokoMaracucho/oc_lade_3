package com.oc.moko.oc_lade.service;

import com.oc.moko.oc_lade.dao.UtilisateurDao;
import com.oc.moko.oc_lade.model.Utilisateur;

public class UtilisateurService {

	private final UtilisateurDao utilisateurDao;
	
	public UtilisateurService(UtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}

	public int addUtilisateur(Utilisateur utilisateur) {
		return utilisateurDao.insertUtilisateur(utilisateur);
	}
}
