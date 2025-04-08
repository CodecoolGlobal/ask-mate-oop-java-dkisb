package com.codecool.askmateoop.dao.model.question;

import java.util.List;

public interface QuestionDAO {
    List<Question> getAllQuestions();

    boolean deleteQuestion(int id);
}
