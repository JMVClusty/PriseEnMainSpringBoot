package com.ERP_Maison.Controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ERP_Maison.Model.Clients;
import com.ERP_Maison.repositery.ClientsDAO;
import com.ERP_Maison.repositery.CommandeDAO;


@Controller
public class CommandeController {
	
	private CommandeDAO commandesDao;
	private ClientsDAO clientsDAO;

	@Autowired
	public CommandeController(CommandeDAO commandesDao, ClientsDAO clientsDAO) {
		super();
		this.commandesDao = commandesDao;
		this.clientsDAO = clientsDAO;
	}
	
	/*
	 * Problèmes: Thymeleaf ne peut pas parcourir deux collections dans un éléments <tr>
	 * https://stackoverflow.com/questions/1839668/what-is-the-best-way-to-combine-two-lists-into-a-map-java
	 * Combiner 2 Lists en une seul map dans le but de parcourir la map dans thymeleaf
	 * Les clés de la Map<String,Integer> seront la première colonne du tableau
	 * Les values de la Map<String,Integer> seront la deuxième colonne du même tableau
	 */	
	public static <K, V> Map<K, V> zipToMap(List<K> keys, List<V> values) {
	    return IntStream.range(0, keys.size()).boxed()
	            .collect(Collectors.toMap(keys::get, values::get));
	}
	
	@GetMapping("/Commandes")
	public String statusCommandes(Model model) {
	
	List<Clients> clients = clientsDAO.list();
	//Récupération uniquement du champ RaisonSociale de la list des clients
	List<String> raisonSociale = clients.stream().map(Clients::getRaisonSociale).collect(Collectors.toList());

	model.addAttribute("clients_commandes", CommandeController.zipToMap(raisonSociale, commandesDao.NbCommandeParClients()));
	model.addAttribute("commande_non_commence", commandesDao.nbCommande_non_commence());
	model.addAttribute("detailCommandes", commandesDao.detailCommande());
	return "Commandes";
	}
}
