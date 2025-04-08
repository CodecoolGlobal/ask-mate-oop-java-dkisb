package com.codecool.askmateoop.dao.model.answer;

import com.codecool.askmateoop.controller.dto.answer.NewAnswerDTO;
import com.codecool.askmateoop.dao.model.user.User;

public interface AnswersDAO {
    NewAnswerDTO createNewAnswer(NewAnswerDTO newAnswerDTO, int questionId);
}
