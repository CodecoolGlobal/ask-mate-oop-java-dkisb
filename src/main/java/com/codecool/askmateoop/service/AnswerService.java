package com.codecool.askmateoop.service;

import com.codecool.askmateoop.controller.dto.answer.NewAnswerDTO;
import com.codecool.askmateoop.dao.model.answer.AnswersDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    private final AnswersDAO answersDAO;

    @Autowired
    public AnswerService(AnswersDAO answersDAO) {
        this.answersDAO = answersDAO;
    }

    public NewAnswerDTO addNewAnswer(NewAnswerDTO answer, int questionId) {
        return  answersDAO.createNewAnswer(answer, questionId);
    }
}
