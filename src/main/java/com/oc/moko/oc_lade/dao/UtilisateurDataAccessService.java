package com.oc.moko.oc_lade.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

	@Override
	public Optional<Utilisateur> selectUtilisateurById(UUID idUtilisateur) {
		return listUtilisateurs.stream()
				.filter(utilisateur -> utilisateur.getIdUtilisateur().equals(idUtilisateur))
				.findFirst();
	}

	@Override
	public int deleteUtilisateurById(UUID idUtilisateur) {
		Optional<Utilisateur> utilisateurMaybe = selectUtilisateurById(idUtilisateur);
		if(utilisateurMaybe.isEmpty()) {
			return 0;
		}
		listUtilisateurs.remove(utilisateurMaybe.get());
		return 1;
	}

	@Override
	public int updateUtilisateurById(UUID idUtilisateur, Utilisateur utilisateurToUpdate) {
		return selectUtilisateurById(idUtilisateur).map(utilisateur -> {
			int indexOfUtilisateurToUpdate = listUtilisateurs.indexOf(utilisateur);
			if(indexOfUtilisateurToUpdate >= 0) {
				listUtilisateurs.set(indexOfUtilisateurToUpdate, new Utilisateur(idUtilisateur, utilisateurToUpdate.getPrenomUtilisateur(), utilisateurToUpdate.getNomUtilisateur()));
				return 1;
			}
			return 0;
		})
		.orElse(0);
	}
}
