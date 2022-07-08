package com.ERP_Maison.Model;

public class Clients {
	
	private String siret;
	private String RaisonSociale;
	
	
	public Clients() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Clients(String siret, String raisonSociale) {
		super();
		this.siret = siret;
		this.RaisonSociale = raisonSociale;
	}

	public String getSiret() {
		return siret;
	}
	public void setSiret(String siret) {
		this.siret = siret;
	}
	public String getRaisonSociale() {
		return RaisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.RaisonSociale = raisonSociale;
	}
	@Override
	public String toString() {
		return "Clients [siret=" + siret + ", RaisonSociale=" + RaisonSociale + "]";
	}

}
