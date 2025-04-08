package com.codecool.askmateoop.service;

import com.codecool.askmateoop.controller.dto.question.NewQuestionDTO;
import com.codecool.askmateoop.controller.dto.question.QuestionDTO;
import com.codecool.askmateoop.dao.model.question.QuestionsDAO;
import com.codecool.askmateoop.dao.model.question.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

@Service
public class QuestionService {

    private final QuestionsDAO questionsDAO;

    @Autowired
    public QuestionService(QuestionsDAO questionsDAO) {
        this.questionsDAO = questionsDAO;
    }

    public List<QuestionDTO> getAllQuestions() {
        List<Question> allQuestions = questionsDAO.getAllQuestions();
        return allQuestions.stream().map(q -> new QuestionDTO(
                q.getTitle(),
                q.getDescription(),
                q.getDate().atStartOfDay(),
                q.getUserId()
        ))
                .toList();
    }

    public QuestionDTO getQuestionById(int id) {
        Question question = questionsDAO.getQuestionById(id);
        return new QuestionDTO(question.getTitle(), question.getDescription(), question.getDate().atStartOfDay(), question.getUserId());
    }

    public boolean deleteQuestionById(int id) {
        // TODO
        throw new UnsupportedOperationException();
    }

    public int addNewQuestion(NewQuestionDTO newQuestion) {
        return questionsDAO.addQuestion(newQuestion);
    }
}
