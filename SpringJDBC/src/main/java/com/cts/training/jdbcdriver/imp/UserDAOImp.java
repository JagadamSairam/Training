package com.cts.training.jdbcdriver.imp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.cts.training.jdbcdriver.interfaces.UserDAO;
import com.cts.training.jdbcdriver.model.User;

public class UserDAOImp implements UserDAO {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public boolean saveUser(User user) {
		String query = "insert into user values(?,?,?,?)";
		try {
			jdbcTemplate.update(query, user.getId(), user.getName(), user.getEmail(), user.getPhone());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateUser(User user) {

		String query = "update user set name=?, email=?,phone=? where id =?";
		try {
			jdbcTemplate.update(query, user.getName(), user.getEmail(), user.getPhone(), user.getId());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteUser(User user) {
		String query = "delete from user where id =?";
		try {
			jdbcTemplate.update(query, user.getId());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public User getUserById(int id) {
		String query = "select * from user where id = ?";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User>(User.class);
		return jdbcTemplate.queryForObject(query, rowMapper, id);
	}

	@Override
	public List<User> getAllUsers() {

		return jdbcTemplate.query("select * from user", new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rownumber) throws SQLException {
			
			User user = new User();
			user.setId(rs.getInt(1));
			user.setName(rs.getString(2));
			user.setEmail(rs.getString(3));
			user.setPhone(rs.getLong(4));
			return user;
			}

});
}
}
	
