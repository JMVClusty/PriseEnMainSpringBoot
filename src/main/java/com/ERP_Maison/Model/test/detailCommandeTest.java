package com.ERP_Maison.Model.test;

public class detailCommandeTest {

	private int IdCommande;
	private String  reference;
	private boolean selected;
	
	public detailCommandeTest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public detailCommandeTest(int idCommande, String reference, boolean selected) {
		super();
		IdCommande = idCommande;
		this.reference = reference;
		this.selected = selected;
		
	}
	
	public int getIdCommande() {
		return IdCommande;
	}
	public void setIdCommande(int idCommande) {
		IdCommande = idCommande;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public boolean isSelected() {
		return selected;
	}
	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
