package com.meals.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.meals.domain.User;
  
@Repository
@Transactional
public class MealServiceDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;
  
    public List<User> list() {
    	
    	String sql = "SELECT * FROM USER";
    	
    	 List<User> listSale = jdbcTemplate.query(sql,
    	            BeanPropertyRowMapper.newInstance(User.class));
    	 
    	return listSale;
    }
  
    public void save(User user) {
    }
  
    public User get(int id) {
        return null;
    }
  
    public void update(User user) {
    }
  
    public void delete(int id) {
    }
}