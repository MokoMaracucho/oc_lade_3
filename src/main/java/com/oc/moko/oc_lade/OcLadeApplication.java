package com.oc.moko.oc_lade;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.oc.moko.oc_lade.model.Utilisateur;

@SpringBootApplication
public class OcLadeApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(OcLadeApplication.class, args);
		
		Utilisateur nouvelUtilisateur = new Utilisateur();
		nouvelUtilisateur.setIdUtilisateur(1L);
		nouvelUtilisateur.setPrenomUtilisateur("Federico");
		nouvelUtilisateur.setNomUtilisateur("Desmoulin");
		
		Utilisateur utilisateur = new Utilisateur();
		
		Configuration configuration = new Configuration().configure().addAnnotatedClass(Utilisateur.class);
		
		ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		
		Session session = sessionFactory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		session.save(nouvelUtilisateur);
		
		utilisateur = (Utilisateur) session.get(Utilisateur.class, 1L);
		
		transaction.commit();
		
		System.out.println(utilisateur);
	}
}
