package com.ERP_Maison;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ERP_Maison.Model.Salarie;
import com.ERP_Maison.repositery.DAO;

@SpringBootApplication
public class ErpMaisonApplication {
	
	private static DAO<Salarie> dao;
	
	public ErpMaisonApplication(DAO<Salarie> dao) {
		ErpMaisonApplication.dao=dao;
	}

	public static void main(String[] args) {
		SpringApplication.run(ErpMaisonApplication.class, args);
		System.out.println("\n Tous les salariés---------------\n");
		List<Salarie> salaries=dao.list();
		salaries.forEach(System.out::println);
		
		System.out.println("\n Récupérer un salarié-------------\n");
		Optional<Salarie> exemple=dao.get(1);
		System.out.println(exemple.get());
	}

}
