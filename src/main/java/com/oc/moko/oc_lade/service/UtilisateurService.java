package com.oc.moko.oc_lade.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.oc.moko.oc_lade.dao.UtilisateurDao;
import com.oc.moko.oc_lade.model.Utilisateur;

@Service
@Transactional // codejava
public class UtilisateurService {

	private final UtilisateurDao utilisateurDao;
	
	@Autowired
	public UtilisateurService(@Qualifier("MySQL") UtilisateurDao utilisateurDao) {
		this.utilisateurDao = utilisateurDao;
	}

	public int addUtilisateur(Utilisateur utilisateur) {
		return utilisateurDao.insertUtilisateur(utilisateur);
	}
	
	public List<Utilisateur> getTousUtilisateurs() {
		return utilisateurDao.selectTousUtilisateurs();
	}
	
	public Optional<Utilisateur> getUtilisateurById(UUID idUtilisateur) {
		return utilisateurDao.selectUtilisateurById(idUtilisateur);
	}
	
	public int deleteUtilisateurById(UUID idUtilisateur) {
		return utilisateurDao.deleteUtilisateurById(idUtilisateur);
	}
	
	public int updateUtilisateurById(UUID idUtilisateur, Utilisateur utilisateurToUpdate) {
		return utilisateurDao.updateUtilisateurById(idUtilisateur, utilisateurToUpdate);
	}
}
