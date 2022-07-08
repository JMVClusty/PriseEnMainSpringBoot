package com.ERP_Maison;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ERP_Maison.Model.Clients;
import com.ERP_Maison.Model.Salarie;
import com.ERP_Maison.repositery.DAO;

@SpringBootApplication
public class ErpMaisonApplication {
	
	private static DAO<Salarie> dao;
	private static DAO<Clients> daoClts;
	
	public ErpMaisonApplication(DAO<Salarie> dao,DAO<Clients>daoClts) {
		ErpMaisonApplication.dao=dao;
		ErpMaisonApplication.daoClts=daoClts;
	}

	public static void main(String[] args) {
		SpringApplication.run(ErpMaisonApplication.class, args);
		System.out.println("\n Tous les salariés---------------\n");
		List<Salarie> salaries=dao.list();
		salaries.forEach(System.out::println);
		
		System.out.println("\n Récupérer un salarié-------------\n");
		Optional<Salarie> exemple=dao.get(1);
		System.out.println(exemple.get());
		
		System.out.println("\n Tous les Clients-------------------\n");
		List<Clients>clients=daoClts.list();
		clients.forEach(System.out::println);
		
	}

}
