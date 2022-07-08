package com.ERP_Maison.Model;

import java.time.LocalDate;

public class Commande {
	
	private int IdCommande;
	private String DescriptionCommande;
	private LocalDate DateCommande;
	private String siret;
	private String IdSalarie;
	
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(int idCommande, String descriptionCommande, LocalDate dateCommande, String siret,
			String idSalarie) {
		super();
		IdCommande = idCommande;
		DescriptionCommande = descriptionCommande;
		DateCommande = dateCommande;
		this.siret = siret;
		IdSalarie = idSalarie;
	}
	public int getIdCommande() {
		return IdCommande;
	}
	public void setIdCommande(int idCommande) {
		IdCommande = idCommande;
	}
	public String getDescriptionCommande() {
		return DescriptionCommande;
	}
	public void setDescriptionCommande(String descriptionCommande) {
		DescriptionCommande = descriptionCommande;
	}
	public LocalDate getDateCommande() {
		return DateCommande;
	}
	public void setDateCommande(LocalDate dateCommande) {
		DateCommande = dateCommande;
	}
	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public String getIdSalarie() {
		return IdSalarie;
	}
	public void setIdSalarie(String idSalarie) {
		IdSalarie = idSalarie;
	}
	
	
}
