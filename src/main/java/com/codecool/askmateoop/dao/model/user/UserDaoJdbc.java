package com.codecool.askmateoop.dao.model.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoJdbc implements UserDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public boolean logInUser(String username, String password) {
        String sql = "SELECT COUNT(*) from users where name=? and password_hash=?";
        try {
            Integer count = jdbcTemplate.queryForObject(sql, Integer.class, username, password);
            return count > 0;
        } catch (Exception e) {
            System.err.println("Error during login: " + e.getMessage());
            return false;
        }
    }

    @Override
    public int getReliabilityLevel(int id) {
        String sql = "SELECT COALESCE(reliability_points, 0) from users where id=?";
        try {
            return jdbcTemplate.queryForObject(sql, Integer.class, id);
        } catch (org.springframework.dao.EmptyResultDataAccessException e) {
            return 0;
        } catch (Exception e) {
            System.err.println("Error during getting points: " + e.getMessage());
            e.printStackTrace();
            return -1;
        }
    }
}
