package com.ERP_Maison.Model;

public class Plan {
	
	private String référence_Plan;
	private String version_Plan;
	private int LongueurDefilsCablage;
	private int NbreDeConnecteursCablage;
	private int QtéProtection;
	
	public Plan(String référence_Plan, String version_Plan, int longueurDefilsCablage, int nbreDeConnecteursCablage,
			int qtéProtection) {
		super();
		this.référence_Plan = référence_Plan;
		this.version_Plan = version_Plan;
		LongueurDefilsCablage = longueurDefilsCablage;
		NbreDeConnecteursCablage = nbreDeConnecteursCablage;
		QtéProtection = qtéProtection;
	}
	public Plan() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getLongueurDefilsCablage() {
		return LongueurDefilsCablage;
	}
	public void setLongueurDefilsCablage(int longueurDefilsCablage) {
		LongueurDefilsCablage = longueurDefilsCablage;
	}
	public int getNbreDeConnecteursCablage() {
		return NbreDeConnecteursCablage;
	}
	public void setNbreDeConnecteursCablage(int nbreDeConnecteursCablage) {
		NbreDeConnecteursCablage = nbreDeConnecteursCablage;
	}
	public int getQtéProtection() {
		return QtéProtection;
	}
	public void setQtéProtection(int qtéProtection) {
		QtéProtection = qtéProtection;
	}
	
	

}
