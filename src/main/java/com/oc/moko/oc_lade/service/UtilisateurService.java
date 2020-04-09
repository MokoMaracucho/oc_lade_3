package com.oc.moko.oc_lade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.oc.moko.oc_lade.dao.UtilisateurDao;
import com.oc.moko.oc_lade.model.Utilisateur;

@Service
public class UtilisateurService {

	private final UtilisateurDao utilisateurDao;
	
	@Autowired
	public UtilisateurService(@Qualifier("MySQL") UtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}

	public int addUtilisateur(Utilisateur utilisateur) {
		return utilisateurDao.insertUtilisateur(utilisateur);
	}
}
