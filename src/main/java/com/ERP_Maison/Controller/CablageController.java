package com.ERP_Maison.Controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ERP_Maison.Model.Cablage;
import com.ERP_Maison.Service.CommandesServices;
import com.ERP_Maison.repositery.DetailCommandeDAO;
import com.ERP_Maison.repositery.MagasinDAO;

@Controller
public class CablageController {

	private DetailCommandeDAO detailCde;
	private MagasinDAO magasinDAO;
	boolean editionAuth=false;
	List<Boolean> selectedCablage;
	
	@Autowired
	public CablageController(DetailCommandeDAO detailCde,MagasinDAO magasinDAO ) {
		super();
		this.detailCde = detailCde;
		this.magasinDAO=magasinDAO;
	}
	
	
	@GetMapping("/Fabrication")
	public String getCablage_A_Produire(Model model) {
		
		model.addAttribute("tableau_cablage_a_produire", detailCde.getAproduire());
		model.addAttribute("magasins",magasinDAO.list());
		
		model.addAttribute("showEdition", editionAuth);
		model.addAttribute("selectedCablage",selectedCablage );
		
		return "Fabrication";
	}
	
	@PostMapping("/Fabrication/vueSelection")
	public String demandeEdition(/*@ModelAttribute session */ Model model) {
		// ici le service authentification (check ROLE salarié )
		if(editionAuth==false) {
			editionAuth=true;
		}else{editionAuth=false;}
		
		return "redirect:/Fabrication";
	}
	
	
	@GetMapping("/detailCde")
	public String commandeAtraiter(Model model) {
		
		CommandesServices listCablageMagasin = new CommandesServices(detailCde.getAproduire(),magasinDAO.list());
		
		int nbreCde = listCablageMagasin.getCommande_a_honorer().size();
		selectedCablage= new ArrayList<Boolean>(Arrays.asList(new Boolean[nbreCde]));
		Collections.fill(selectedCablage, false);
		System.out.println(selectedCablage.toString());
		
		
		model.addAttribute("form", listCablageMagasin);
		model.addAttribute("isSelected", selectedCablage);

		return "cde_a_traiter";
	}





	
	@PostMapping("/cablage/selected")
	public void AddCablagetoDB(	) {
		
		// on recup l'objet detailcommande
		// recup l'objet magasins
		//
		 
	}
	
	
	
	
	
}
