package com.oc.moko.oc_lade.model;

import javax.persistence.Column;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="tb_utilisateur")
public class Utilisateur {
	
	@Id
	@GeneratedValue
	@Column(name="id_utilisateur")
	@NotBlank
	private UUID idUtilisateur;
	@Column(name="prenom_utilisateur")
	@NotBlank
	private String prenomUtilisateur;
	@Column(name="nom_utilisateur")
	@NotBlank
	private String nomUtilisateur;

	public Utilisateur() {
	}

	public Utilisateur(
		@JsonProperty("id_utilisateur") UUID idUtilisateur,
//		UUID idUtilisateur,
		@JsonProperty("prenom_utilisateur") String prenomUtilisateur,
//		String prenomUtilisateur,
		@JsonProperty("nom_utilisateur") String nomUtilisateur
//		String nomUtilisateur
	) {
		this.idUtilisateur = idUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
	}

	public UUID getIdUtilisateur() {
		return idUtilisateur;
	}
	
	public void setIdUtilisateur(UUID idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}
	
	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}
	
	public String getNomUtilisateur() {
		return nomUtilisateur;
	}
	
	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", prenomUtilisateur=" + prenomUtilisateur + ", nomUtilisateur=" + nomUtilisateur + "]";
	}
}
