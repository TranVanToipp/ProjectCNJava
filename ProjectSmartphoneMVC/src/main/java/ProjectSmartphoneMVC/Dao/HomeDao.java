package ProjectSmartphoneMVC.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import ProjectSmartphoneMVC.Entity.MapperUser;
import ProjectSmartphoneMVC.Entity.User;

@Repository
public class HomeDao {
	@Autowired
	public JdbcTemplate _jdbcTemplate;
	
	public List<User> GetDataUser(){
		List<User> list = new ArrayList<User>(); 
		String sql = "SELECT * FROM user";
		list = _jdbcTemplate.query(sql, new MapperUser());
		return list;
	} 
	
	
}
