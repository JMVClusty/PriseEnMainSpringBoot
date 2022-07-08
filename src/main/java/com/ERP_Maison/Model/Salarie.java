package com.ERP_Maison.Model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Salarie {
	private int IdSalarie_Salarié ;
	
	private String Nom_Salarie;

	private String password;
	
	private String Prenom_Salarie;
	
	final public String getPrenom_Salarie() {
		return Prenom_Salarie;
	}

	public void setPrenom_Salarie(String firstName) {
		this.Prenom_Salarie = firstName;
	}

	private String role;


	public Salarie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNom_Salarie() {
		return Nom_Salarie;
	}

	public void setNom_Salarie(String name) {
		this.Nom_Salarie = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Salarie [IdSalarie_Salarié=" + IdSalarie_Salarié + ", Nom_Salarie=" + Nom_Salarie + ", password="
				+ password + ", Prenom_Salarie=" + Prenom_Salarie + ", role=" + role + "]";
	}

	public int getIdSalarie_Salarié() {
		return IdSalarie_Salarié;
	}

	public void setIdSalarie_Salarié(int idSalarie_Salarié) {
		IdSalarie_Salarié = idSalarie_Salarié;
	}
}
