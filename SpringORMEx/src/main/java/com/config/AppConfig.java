package com.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.model.Employee;

@Configuration
@ComponentScan("com")
@PropertySource("myprops.properties")
@EnableTransactionManagement
public class AppConfig {
	
	@Autowired private Environment env;
	
	@Bean
	public DriverManagerDataSource ds() {
		DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName(env.getProperty("dcn"));
		dmds.setUrl(env.getProperty("url"));
		dmds.setUsername(env.getProperty("user"));
		dmds.setPassword(env.getProperty("pwd"));
		return dmds;
	}
	
	@Bean
	public LocalSessionFactoryBean sf() {
		LocalSessionFactoryBean lsfb = new LocalSessionFactoryBean();
		lsfb.setDataSource(ds());
		lsfb.setHibernateProperties(hprop());
		lsfb.setAnnotatedClasses(Employee.class);
		return lsfb;
	}
	
	public Properties hprop() {
		Properties p = new Properties();
		p.put("hibernate.dialect", env.getProperty("dial"));
		p.put("hibernate.format_sql", env.getProperty("fs"));
		p.put("hibernate.show_sql", env.getProperty("ss"));
		p.put("hibernate.hbm2ddl.auto", env.getProperty("hbm2ddl.auto"));
		return p;
	}
	
	@Bean
	public HibernateTemplate ht() {
		HibernateTemplate htmp = new HibernateTemplate();
//		htmp.setCheckWriteOperations(false);
		htmp.setSessionFactory(sf().getObject());
		return htmp;
	}
	
	@Bean
	public HibernateTransactionManager htm() {
		HibernateTransactionManager htmanager = new HibernateTransactionManager();
		htmanager.setSessionFactory(sf().getObject());
		return htmanager;
	}
	
	
}
