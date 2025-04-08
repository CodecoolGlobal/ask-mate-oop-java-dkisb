package com.codecool.askmateoop.service;

import com.codecool.askmateoop.controller.dto.question.NewQuestionDTO;
import com.codecool.askmateoop.controller.dto.question.QuestionDTO;
import com.codecool.askmateoop.dao.model.question.QuestionDAO;
import com.codecool.askmateoop.dao.model.question.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionDAO questionDAO;

    @Autowired
    public QuestionService(QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    public List<QuestionDTO> getAllQuestions() {
        List<Question> allQuestions = questionDAO.getAllQuestions();
        return allQuestions.stream().map(q -> new QuestionDTO(
                q.title(),
                q.content(),
                q.createdAt().atStartOfDay()
        ))
                .toList();
    }

    public QuestionDTO getQuestionById(int id) {
        // TODO
        throw new UnsupportedOperationException();
    }

    public boolean deleteQuestionById(int id) {
        // TODO
        throw new UnsupportedOperationException();
    }

    public int addNewQuestion(NewQuestionDTO question) {
        // TODO
        throw new UnsupportedOperationException();
    }
}
