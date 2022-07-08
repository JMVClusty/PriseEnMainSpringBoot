package com.ERP_Maison.repositery;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ERP_Maison.Model.DetailCommande;

@Repository
public class DetailCommandeDAO implements DAO<DetailCommande> {
	
	private JdbcTemplate jtm;
	
	@Autowired
	

	@Override
	public List<DetailCommande> list() {
		// TODO Auto-generated method stub
		return null;
	}

	public DetailCommandeDAO(JdbcTemplate jtm) {
		super();
		this.jtm = jtm;
	}
	
	  RowMapper<DetailCommande>mapperRequete_Cde_manquant = (rs,rowNum)->{
		  return new DetailCommande(
				  rs.getInt("IdCommande"),
				  rs.getString("ref"),
				  rs.getString("vers"),
				  rs.getInt("qty"),
				  rs.getString("RaisonSociale"));

	   };
	 
	   
	   public List<DetailCommande> getAproduire(){
		   String sql="SELECT IdCommande,RaisonSociale,IFNULL(référence_Qté,'NA') as ref, IFNULL(version_Qté,'NA')as vers,IFNULL(QtyCablageCommandé-cablage_fabri,0) as qty "
		   		+ "FROM commande "
		   		+ "LEFT JOIN detailcommande "
		   		+ "ON commande.IdCommande = detailcommande.IdCommande_Qté "
		   		+ "LEFT JOIN client "
		   		+ "ON commande.siret = client.siret "
		   		+ "LEFT JOIN (SELECT IdCommande as Id,référence_Plan,version_Plan,COUNT(*)as cablage_fabri  "
		   		+ "		FROM cablage "
		   		+ "		GROUP BY Id,version_Plan,référence_Plan) as tbcab2 "
		   		+ "ON tbcab2.Id=detailcommande.IdCommande_Qté  "
		   		+ "AND detailcommande.référence_Qté=tbcab2.référence_Plan "
		   		+ "AND detailcommande.version_Qté=tbcab2.version_Plan "
		   		+ "GROUP BY IdCommande,ref,vers";
		   		
		   return jtm.query(sql,mapperRequete_Cde_manquant);
	   }

	@Override
	public void create(DetailCommande t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<DetailCommande> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(DetailCommande t, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
