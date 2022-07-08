package com.ERP_Maison.Model;

public class Magasin {
	private String VilleMagasin;
	private int StockFils;
	private int StockConnecteurs;
	private int StockProtection;
	
	public Magasin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Magasin(String villeMagasin, int stockFils, int stockConnecteurs, int stockProtection) {
		super();
		VilleMagasin = villeMagasin;
		StockFils = stockFils;
		StockConnecteurs = stockConnecteurs;
		StockProtection = stockProtection;
	}
	public String getVilleMagasin() {
		return VilleMagasin;
	}
	public void setVilleMagasin(String villeMagasin) {
		VilleMagasin = villeMagasin;
	}
	public int getStockFils() {
		return StockFils;
	}
	public void setStockFils(int stockFils) {
		StockFils = stockFils;
	}
	public int getStockConnecteurs() {
		return StockConnecteurs;
	}
	public void setStockConnecteurs(int stockConnecteurs) {
		StockConnecteurs = stockConnecteurs;
	}
	public int getStockProtection() {
		return StockProtection;
	}
	public void setStockProtection(int stockProtection) {
		StockProtection = stockProtection;
	}
	

}
