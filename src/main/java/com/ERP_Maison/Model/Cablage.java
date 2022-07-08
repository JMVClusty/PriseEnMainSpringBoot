package com.ERP_Maison.Model;

public class Cablage {
	
	private int NumEtiquette_Cablage ;
	private String référence_Plan ;
	private String version_Plan;
	private String VilleMagasin;
	private int IdCommande;
	
	
	public Cablage() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Cablage(int numEtiquette_Cablage, String référence_Plan, String version_Plan, String villeMagasin,
			int idCommande) {
		super();
		NumEtiquette_Cablage = numEtiquette_Cablage;
		this.référence_Plan = référence_Plan;
		this.version_Plan = version_Plan;
		VilleMagasin = villeMagasin;
		IdCommande = idCommande;
	}


	public int getNumEtiquette_Cablage() {
		return NumEtiquette_Cablage;
	}


	public void setNumEtiquette_Cablage(int numEtiquette_Cablage) {
		NumEtiquette_Cablage = numEtiquette_Cablage;
	}


	public String getRéférence_Plan() {
		return référence_Plan;
	}


	public void setRéférence_Plan(String référence_Plan) {
		this.référence_Plan = référence_Plan;
	}


	public String getVersion_Plan() {
		return version_Plan;
	}


	public void setVersion_Plan(String version_Plan) {
		this.version_Plan = version_Plan;
	}


	public String getVilleMagasin() {
		return VilleMagasin;
	}


	public void setVilleMagasin(String villeMagasin) {
		VilleMagasin = villeMagasin;
	}


	public int getIdCommande() {
		return IdCommande;
	}


	public void setIdCommande(int idCommande) {
		IdCommande = idCommande;
	}
	
	

}
