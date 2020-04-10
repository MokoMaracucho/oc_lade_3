package com.oc.moko.oc_lade.hibernate;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.oc.moko.oc_lade.model.Utilisateur;

public class HibernateUtil {
	
	private static StandardServiceRegistry registry;
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFactory == null) {
			try {
				StandardServiceRegistryBuilder registryBuilder = new StandardServiceRegistryBuilder();
				
				Map<String, Object> settings = new HashMap<>();
				
				settings.put(Environment.DRIVER, 			"com.mysql.cj.jdbc.Driver");
	            settings.put(Environment.URL, 				"jdbc:mysql://localhost:3306/db_lade");
	            settings.put(Environment.USER, 				"adm_lade");
	            settings.put(Environment.PASS, 				"LAde33.");
	            settings.put(Environment.HBM2DDL_AUTO, 		"create");
	            settings.put(Environment.SHOW_SQL, 			true);

	            settings.put("hibernate.hikari.connectionTimeout", 		"20000");
	            settings.put("hibernate.hikari.minimumIdle", 			"10");
	            settings.put("hibernate.hikari.maximumPoolSize", 		"20");
	            settings.put("hibernate.hikari.idleTimeout", 			"300000");
	            
	            registryBuilder.applySettings(settings);

	            registry = registryBuilder.build();
	            MetadataSources sources = new MetadataSources(registry)
	                  .addAnnotatedClass(Utilisateur.class);
	            Metadata metadata = sources.getMetadataBuilder().build();
	            sessionFactory = metadata.getSessionFactoryBuilder().build();
			
			} catch(Exception e) {
				if (registry != null) {
	               StandardServiceRegistryBuilder.destroy(registry);
	            }
	            e.printStackTrace();
			}
		}
		return sessionFactory;
	}

	public static void shutdown() {
		if (registry != null) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
}
