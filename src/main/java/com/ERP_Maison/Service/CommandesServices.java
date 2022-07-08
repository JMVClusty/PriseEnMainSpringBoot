package com.ERP_Maison.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.ERP_Maison.Model.DetailCommande;
import com.ERP_Maison.Model.Magasin;

public class CommandesServices {
	private List<DetailCommande> commande_a_honorer;
	
	private List<Magasin> magasin_selected;
	
	private List<Boolean> commandes_selected;
	
	

	public CommandesServices() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommandesServices(List<DetailCommande> commande_a_honorer, List<Magasin> magasin_selected) {
		super();
		this.commande_a_honorer = commande_a_honorer;
		this.magasin_selected = magasin_selected;
		this.commandes_selected = new ArrayList<Boolean>();
		Collections.fill(commandes_selected, false);
	}

	public List<DetailCommande> getCommande_a_honorer() {
		return commande_a_honorer;
	}

	public void setCommande_a_honorer(List<DetailCommande> commande_a_honorer) {
		this.commande_a_honorer = commande_a_honorer;
	}




	public List<Magasin> getMagasin_selected() {
		return magasin_selected;
	}

	public void setMagasin_selected(List<Magasin> magasin_selected) {
		this.magasin_selected = magasin_selected;
	}
	
	public List<Boolean> getCommande_selected() {
		return commandes_selected;
	}

	public void setCommande_selected(List<Boolean> commande_selected) {
		this.commandes_selected = commande_selected;
	}

}
