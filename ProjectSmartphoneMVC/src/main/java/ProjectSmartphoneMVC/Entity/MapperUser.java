package ProjectSmartphoneMVC.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperUser implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setFullname(rs.getString("fullname"));
		user.setEmail(rs.getString("email"));
		user.setPhone_number(rs.getString("phone_number"));
		user.setAddress(rs.getString("address"));
		user.setUserName(rs.getString("userName	"));
		user.setPassword(rs.getString("password"));
		user.setRole_id(rs.getInt("role_id "));
		return user;
	}
	
}
