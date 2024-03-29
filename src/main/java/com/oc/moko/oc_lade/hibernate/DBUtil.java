package com.oc.moko.oc_lade.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Properties;

import com.zaxxer.hikari.HikariDataSource;


public class DBUtil {

	private static final String DB_USERNAME = "db.username";
	private static final String DB_PASSWORD = "db.password";
	private static final String DB_URL = "db.url";
	private static final String DB_DRIVER_CLASS = "db.class.name";
	
	private static Properties properties = null;
	private static HikariDataSource dataSource;
	static {
		try {
			properties = new Properties();
			properties.load(new FileInputStream("src/main/resources/application.properties"));
			
			dataSource = new HikariDataSource();
			
			dataSource.setDriverClassName(properties.getProperty(DB_DRIVER_CLASS));;
			
			dataSource.setJdbcUrl(properties.getProperty(DB_URL));
			dataSource.setUsername(properties.getProperty(DB_USERNAME));
			dataSource.setPassword(properties.getProperty(DB_PASSWORD));
			
//			dataSource.setMinimumIdle(100);
//			dataSource.setMaximumPoolSize(10000);
//			dataSource.setAutoCommit(false);
//			dataSource.setLoginTimeout(3);
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
//	public static DataSource getDataSource() {
//		return dataSource;
//	}
}
