package com.ERP_Maison.repositery;


import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ERP_Maison.Model.Commande;
import com.ERP_Maison.Model.DetailCommande;

@Repository
public class CommandeDAO implements DAO<Commande> {
	
	private JdbcTemplate jtm;
	@Autowired
	public CommandeDAO(JdbcTemplate jtm) {
		super();
		this.jtm = jtm;
	}
	
	
	  RowMapper<DetailCommande>mapperRequete_detail_commande = (rs,rowNum)->{
		  return new DetailCommande(
				  rs.getInt("IdCommande"),
				  rs.getString("ref"),
				  rs.getString("vers"),
				  rs.getInt("qty"),
				  rs.getString("RaisonSociale"));

	   };
	 
			
	
	public List<Integer> NbCommandeParClients() {
		String sql= "SELECT IFNULL(COUNT(IdCommande),0) "
				+ "FROM client "
				+ "LEFT JOIN commande "
				+ "ON client.siret=commande.siret "
				+ "GROUP BY RaisonSociale";
			
		
		List<Integer> resultat = jtm.queryForList(sql,Integer.class);
		
		return resultat;
	}
	
	public int nbCommande_non_commence() {
		String sql ="SELECT COUNT(IdCommande) AS Commande_En_Attente "
				+ "FROM commande "
				+ "WHERE IdCommande "
				+ "NOT IN (SELECT IdCommande FROM cablage)";
		
		int resultat = jtm.queryForObject(sql,Integer.class);
		
		return resultat;
	}

	public List<DetailCommande> detailCommande(){
		String sql= "SELECT IdCommande,RaisonSociale,IFNULL(référence_Qté,'NA') as ref, IFNULL(version_Qté,'NA')as vers,IFNULL(QtyCablageCommandé,0) as qty "
				+ "FROM commande "
				+ "LEFT JOIN detailcommande "
				+ "ON commande.IdCommande = detailcommande.IdCommande_Qté "
				+ "LEFT JOIN client "
				+ "ON commande.siret = client.siret";
		
		return jtm.query(sql,mapperRequete_detail_commande);
	}
	
	@Override
	public List<Commande> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void create(Commande t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Commande> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Commande t, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	

}
