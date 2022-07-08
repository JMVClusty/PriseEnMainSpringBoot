package com.ERP_Maison.repositery;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ERP_Maison.Model.Magasin;

@Repository
public class MagasinDAO implements DAO<Magasin>{

	private JdbcTemplate jtm;
	
	@Autowired
	public MagasinDAO(JdbcTemplate jtm) {
		super();
		this.jtm = jtm;
	}
	
	RowMapper<Magasin> rowMapperMag = (rs, rowNum)->{
		Magasin magasins = new Magasin();
		magasins.setVilleMagasin(rs.getString("VilleMagasin"));
		magasins.setStockFils(rs.getInt("StockFils"));
		magasins.setStockConnecteurs(rs.getInt("StockConnecteurs"));
		magasins.setStockProtection(rs.getInt("StockProtection"));
		return magasins;
	};
	
	@Override
	public List<Magasin> list() {
		String sql = "SELECT * FROM magasin";
		return jtm.query(sql,rowMapperMag);
	}

	@Override
	public void create(Magasin t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Magasin> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Magasin t, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
