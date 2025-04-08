package com.codecool.askmateoop.dao.model.answer;

import com.codecool.askmateoop.controller.dto.answer.NewAnswerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.Objects;

@Repository
public class AnswerDaoJdbc implements AnswerDAO {


    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AnswerDaoJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int createNewAnswer(NewAnswerDTO newAnswerDTO, int questionId, int userId) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        String sql = "INSERT INTO answer (question_id, content,user_id, created_at) VALUES (?, ?,?,?)";

        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1,questionId );
            ps.setString(2, newAnswerDTO.content());
            ps.setInt(3, userId);
            return ps;
        }, keyHolder);

        if(keyHolder.getKeys() != null && !keyHolder.getKeys().isEmpty()){
            return Objects.requireNonNull(keyHolder.getKey()).intValue();
        } else {
            return -1;
        }
    }


}
