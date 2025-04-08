package com.codecool.askmateoop.dao.model.question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionDaoJdbc implements QuestionDAO {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public QuestionDaoJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<Question> getAllQuestions() {
        String sql = "SELECT id,title,content,created_at,user_id FROM question";
        return jdbcTemplate.query(sql, (rs, rowNum) -> new Question(
                rs.getInt("id"),
                rs.getString("title"),
                rs.getString("content"),
                rs.getDate("created_at").toLocalDate(),
                rs.getInt("user_id")
        ));
    }
}


