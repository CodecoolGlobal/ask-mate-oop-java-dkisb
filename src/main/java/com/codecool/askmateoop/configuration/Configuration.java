package com.codecool.askmateoop.configuration;

import com.codecool.askmateoop.dao.model.question.QuestionsDAO;
import com.codecool.askmateoop.dao.model.question.QuestionsDaoJdbc;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootConfiguration
public class Configuration {

//    TODO: Add the url of your database to the Environment Variables of the Run Configuration
//    @Value("${askmate.database.url}")
//    private String databaseUrl;

    @Bean
    public QuestionsDAO questionsDAO(JdbcTemplate jdbcTemplate) {
        return new QuestionsDaoJdbc(jdbcTemplate);
    }

}
