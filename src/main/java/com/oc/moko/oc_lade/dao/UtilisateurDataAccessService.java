package com.oc.moko.oc_lade.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.oc.moko.oc_lade.model.Utilisateur;

@Repository("MySQL")
public class UtilisateurDataAccessService implements UtilisateurDao {

	private static List<Utilisateur> listUtilisateurs = new ArrayList<>();

	@Override
	public int insertUtilisateur(UUID idUtilisateur, Utilisateur utilisateur) {
		listUtilisateurs.add(new Utilisateur(idUtilisateur, utilisateur.getPrenomUtilisateur(), utilisateur.getNomUtilisateur()));
		return 1;
	}

	@Override
	public List<Utilisateur> selectTousUtilisateurs() {
		return listUtilisateurs;
	}
}
