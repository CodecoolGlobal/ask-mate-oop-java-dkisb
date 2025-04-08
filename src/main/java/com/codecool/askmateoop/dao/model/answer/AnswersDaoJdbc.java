package com.codecool.askmateoop.dao.model.answer;

import com.codecool.askmateoop.controller.dto.answer.NewAnswerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AnswersDaoJdbc implements AnswersDAO{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public AnswersDaoJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public NewAnswerDTO createNewAnswer(NewAnswerDTO newAnswerDTO, int questionId) {
        String sql = "INSERT INTO answer (question_id, content) VALUES (?, ?)";
        jdbcTemplate.update(sql, questionId, newAnswerDTO.content());
        return newAnswerDTO;
    }


}
