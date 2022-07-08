package com.ERP_Maison.Model;

public class DetailCommande {
	
	private int IdCommande;
	private String reference;
	private String version;
	private int qty ;
	private String RaisonSociale; //Ajout du champ pour les besoins du mappage jointure de table
	
	public String getRaisonSociale() {
		return RaisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		RaisonSociale = raisonSociale;
	}

	public int getIdCommande() {
		return IdCommande;
	}
	
	public DetailCommande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DetailCommande(int idCommande, String référence_Qté, String version_Qté, int qtyCablageCommandé,
			String raisonSociale) {
		super();
		IdCommande = idCommande;
		this.reference = référence_Qté;
		this.version = version_Qté;
		qty = qtyCablageCommandé;
		RaisonSociale = raisonSociale;
	}

	public DetailCommande(int idCommande, String référence_Qté, String version_Qté, int qtyCablageCommandé) {
		super();
		IdCommande = idCommande;
		this.reference = référence_Qté;
		this.version = version_Qté;
		qty = qtyCablageCommandé;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public void setIdCommande(int idCommande) {
		IdCommande = idCommande;
	}
	
	


	

}
