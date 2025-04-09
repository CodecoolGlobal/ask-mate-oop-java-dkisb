package com.codecool.askmateoop.configuration;

import com.codecool.askmateoop.dao.model.answer.AnswerDAO;
import com.codecool.askmateoop.dao.model.answer.AnswerDaoJdbc;
import com.codecool.askmateoop.dao.model.question.QuestionDAO;
import com.codecool.askmateoop.dao.model.question.QuestionDaoJdbc;
import com.codecool.askmateoop.dao.model.user.UserDAO;
import com.codecool.askmateoop.dao.model.user.UserDaoJdbc;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootConfiguration
public class Configuration {

//    TODO: Add the url of your database to the Environment Variables of the Run Configuration
//    @Value("${askmate.database.url}")
//    private String databaseUrl;

    @Bean
    public QuestionDAO questionDAO(JdbcTemplate jdbcTemplate) {
        return new QuestionDaoJdbc(jdbcTemplate);
    }

    @Bean
    public AnswerDAO answerDAO(JdbcTemplate jdbcTemplate) {
        return new AnswerDaoJdbc(jdbcTemplate);
    }

    @Bean
    public UserDAO userDAO(JdbcTemplate jdbcTemplate) {
        return new UserDaoJdbc(jdbcTemplate);
    }
}
