package com.codecool.askmateoop.controller.dto.answer;

import java.time.LocalDate;

public record NewAnswerDTO(String content,LocalDate createdAt, int questionId, int userId) {
}
