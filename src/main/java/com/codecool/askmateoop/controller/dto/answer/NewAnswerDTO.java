package com.codecool.askmateoop.controller.dto.answer;

import java.sql.Timestamp;
import java.time.LocalDate;

public record NewAnswerDTO(String content, int questionId, int userId) {
}
