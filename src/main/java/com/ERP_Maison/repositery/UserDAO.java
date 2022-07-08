package com.ERP_Maison.repositery;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.ERP_Maison.Model.Salarie;

/***********************************************************************************
 * basé sur le tuto: https://www.youtube.com/watch?v=0uLqdBpYAVA&ab_channel=DanVega*
 * *********************************************************************************/

@Repository
public class UserDAO implements DAO<Salarie>{
	private static final Logger log = org.slf4j.LoggerFactory.getLogger(UserDAO.class);
	private JdbcTemplate jtm;
	
	@Autowired
	public UserDAO(JdbcTemplate jtm) {
		super();
		this.jtm = jtm;
	}

	
	RowMapper<Salarie> rowMapper = (rs,rowNum) ->{
		Salarie salarie = new Salarie();
		salarie.setIdSalarie_Salarié(rs.getInt("IdSalarie_Salarié"));
		salarie.setPrenom_Salarie(rs.getString("Prenom_Salarie"));
		salarie.setNom_Salarie(rs.getString("Nom_Salarie"));
		salarie.setRole(rs.getString("ROLE_Salarie"));
		return salarie;
	};


	
	@Override
	public List<Salarie> list() {
		String sql = "SELECT IdSalarie_Salarié, Nom_Salarie, Prenom_Salarie, ROLE_Salarie FROM salarie";
		return jtm.query(sql, rowMapper);
	}


	@SuppressWarnings("deprecation")
	public Optional<Salarie> authentifier( String name,String firstname,String pwd){
		Salarie salarie=null;
		String sql="SELECT * FROM salarie where Nom_Salarie=? AND Prenom_Salarie=? AND password=?" ;
				
		try {
			salarie = jtm.queryForObject(sql,new Object[]{name,firstname,pwd}, rowMapper);
			return Optional.of(salarie);
		} catch (Exception  e) {
			return Optional.empty();
			
		}
	}
	
	
	@SuppressWarnings("deprecation")
	@Override
	public Optional<Salarie> get(int id) {
		String sql= "SELECT * FROM salarie where IdSalarie_Salarié= ?";
		Salarie salarie=null;
		try {
			salarie = jtm.queryForObject(sql, new Object[] {id},rowMapper);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			log.info("Salarié non identifié" + id);
		}
		return Optional.ofNullable(salarie);
	}




	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(Salarie t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Salarie t, int id) {
		// TODO Auto-generated method stub
		
	}
	
	
}
