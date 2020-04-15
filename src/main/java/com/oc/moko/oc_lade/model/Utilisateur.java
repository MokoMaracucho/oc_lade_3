package com.oc.moko.oc_lade.model;

import javax.persistence.Column;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="tb_utilisateur")
public class Utilisateur {
	
	@Id
	@GeneratedValue
	@NotBlank
	@Column(name="id_utilisateur")
	private UUID idUtilisateur;
	
	@NotBlank
	@Column(name="prenom_utilisateur")
	private String prenomUtilisateur;
	@NotBlank
	@Column(name="nom_utilisateur")
	private String nomUtilisateur;
	@NotBlank
	@Column(name="email_utilisateur")
	private String emailUtilisateur;
	@NotBlank
	@Column(name="mot_de_passe_utilisateur")
	private String motDePasseUtilisateur;
	@NotBlank
	@Enumerated(EnumType.STRING)
	@Column(name="privilege_utilisateur")
	private Privilege privilegeUtilisateur;
	@NotBlank
	@Column(name="date_inscription_utilisateur")
	private Timestamp dateInscriptionUtilisateur;

//	@OneToMany(mappedBy="Site")
//	private List<Site> listeSites;
//	@OneToMany(mappedBy="Secteur")
//	private List<Secteur> listeSecteurs;
//	@OneToMany(mappedBy="Voie")
//	private List<Voie> listeVoies;
//	@OneToMany(mappedBy="Longueur")
//	private List<Longueur> listeLongueurs;
//	@OneToMany(mappedBy="Commentaire")
//	private List<Commentaire> listeCommentaires;
//	@OneToMany(mappedBy="Topo")
//	private List<Topo> listeTopos;
//	@OneToMany(mappedBy="ReservationTopo")
//	private List<ReservationTopo> listeReservationTopo;

	public Utilisateur(
		@NotBlank UUID idUtilisateur,
		@NotBlank String prenomUtilisateur,
		@NotBlank String nomUtilisateur,
		@NotBlank String emailUtilisateur,
		@NotBlank String motDePasseUtilisateur,
		@NotBlank Privilege privilegeUtilisateur,
		@NotBlank Timestamp dateInscriptionUtilisateur
//		List<Site> listeSites,
//		List<Secteur> listeSecteurs,
//		List<Voie> listeVoies,
//		List<Longueur> listeLongueurs,
//		List<Commentaire> listeCommentaires,
//		List<Topo> listeTopos,
//		List<ReservationTopo> listeReservationTopo
	) {
		this.idUtilisateur = idUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.nomUtilisateur = nomUtilisateur;
		this.emailUtilisateur = emailUtilisateur;
		this.motDePasseUtilisateur = motDePasseUtilisateur;
		this.privilegeUtilisateur = privilegeUtilisateur;
		this.dateInscriptionUtilisateur = dateInscriptionUtilisateur;
//		this.listeSites = listeSites;
//		this.listeSecteurs = listeSecteurs;
//		this.listeVoies = listeVoies;
//		this.listeLongueurs = listeLongueurs;
//		this.listeCommentaires = listeCommentaires;
//		this.listeTopos = listeTopos;
//		this.listeReservationTopo = listeReservationTopo;
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

	public String getEmailUtilisateur() {
		return emailUtilisateur;
	}

	public void setEmailUtilisateur(String emailUtilisateur) {
		this.emailUtilisateur = emailUtilisateur;
	}

	public String getMotDePasseUtilisateur() {
		return motDePasseUtilisateur;
	}

	public void setMotDePasseUtilisateur(String motDePasseUtilisateur) {
		this.motDePasseUtilisateur = motDePasseUtilisateur;
	}

	public Privilege getPrivilegeUtilisateur() {
		return privilegeUtilisateur;
	}

	public void setPrivilegeUtilisateur(Privilege privilegeUtilisateur) {
		this.privilegeUtilisateur = privilegeUtilisateur;
	}

	public Timestamp getDateInscriptionUtilisateur() {
		return dateInscriptionUtilisateur;
	}

	public void setDateInscriptionUtilisateur(Timestamp dateInscriptionUtilisateur) {
		this.dateInscriptionUtilisateur = dateInscriptionUtilisateur;
	}

//	public List<Site> getListeSites() {
//		return listeSites;
//	}
//
//	public void setListeSites(List<Site> listeSites) {
//		this.listeSites = listeSites;
//	}
//
//	public List<Secteur> getListeSecteurs() {
//		return listeSecteurs;
//	}
//
//	public void setListeSecteurs(List<Secteur> listeSecteurs) {
//		this.listeSecteurs = listeSecteurs;
//	}
//
//	public List<Voie> getListeVoies() {
//		return listeVoies;
//	}
//
//	public void setListeVoies(List<Voie> listeVoies) {
//		this.listeVoies = listeVoies;
//	}
//
//	public List<Longueur> getListeLongueurs() {
//		return listeLongueurs;
//	}
//
//	public void setListeLongueurs(List<Longueur> listeLongueurs) {
//		this.listeLongueurs = listeLongueurs;
//	}
//
//	public List<Commentaire> getListeCommentaires() {
//		return listeCommentaires;
//	}
//
//	public void setListeCommentaires(List<Commentaire> listeCommentaires) {
//		this.listeCommentaires = listeCommentaires;
//	}
//
//	public List<Topo> getListeTopos() {
//		return listeTopos;
//	}
//
//	public void setListeTopos(List<Topo> listeTopos) {
//		this.listeTopos = listeTopos;
//	}
//
//	public List<ReservationTopo> getListeReservationTopo() {
//		return listeReservationTopo;
//	}
//
//	public void setListeReservationTopo(List<ReservationTopo> listeReservationTopo) {
//		this.listeReservationTopo = listeReservationTopo;
//	}
}
