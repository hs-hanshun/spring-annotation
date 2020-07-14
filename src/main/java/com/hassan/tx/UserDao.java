package com.hassan.tx;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public void insert(){
		String sql = "INSERT INTO `t_user`(t_name,t_age,t_address,t_pwd) VALUES(?,?,?,?)";
		String username = UUID.randomUUID().toString().substring(0, 5);
		jdbcTemplate.update(sql, username,19,"aa","a");
		
	}

}
