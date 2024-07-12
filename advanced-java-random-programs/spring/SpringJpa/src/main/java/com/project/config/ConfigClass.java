package com.project.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@Configuration
@ComponentScan(basePackages ="com.project")
@EnableJpaRepositories("com.project.repo")
public class ConfigClass{
	
	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory()
	{
		LocalEntityManagerFactoryBean bean= 
				new  LocalEntityManagerFactoryBean();
		bean.setPersistenceUnitName("SpringJpa");
		return bean;
	}

	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf)
	{
		JpaTransactionManager transactionManager= 
				new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		return  transactionManager;
	}


}
