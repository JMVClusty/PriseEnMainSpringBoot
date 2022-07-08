package com.ERP_Maison.repositery;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ERP_Maison.Model.Clients;
@Repository
public class ClientsDAO implements DAO<Clients>{
	
	private JdbcTemplate jtm;
	@Autowired
	public ClientsDAO(JdbcTemplate jtm) {
		super();
		this.jtm = jtm;
	}
	
	RowMapper<Clients> rowMapperClts = (rs, rowNum)->{
		Clients clients = new Clients();
		clients.setSiret(rs.getString("siret"));
		clients.setRaisonSociale(rs.getString("RaisonSociale"));
		return clients;
		
	};
	
	

	@Override
	public List<Clients> list() {
		String sql= "SELECT * FROM client";
		return jtm.query(sql, rowMapperClts);
	}

	@Override
	public void create(Clients t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Clients> get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Clients t, int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
