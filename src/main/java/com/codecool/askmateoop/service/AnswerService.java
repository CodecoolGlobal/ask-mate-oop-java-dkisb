package com.codecool.askmateoop.service;

import com.codecool.askmateoop.controller.dto.answer.NewAnswerDTO;
import com.codecool.askmateoop.dao.model.answer.AnswerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {

    private final AnswerDAO answerDAO;

    @Autowired
    public AnswerService(AnswerDAO answerDAO) {
        this.answerDAO = answerDAO;
    }

    public int addNewAnswer(NewAnswerDTO answer, int question_id, int user_id) {
        return  answerDAO.createNewAnswer(answer);
    }
}
