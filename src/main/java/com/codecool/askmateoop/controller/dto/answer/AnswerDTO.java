package com.codecool.askmateoop.controller.dto.answer;

import java.time.LocalDateTime;

public record AnswerDTO(String title, String content, LocalDateTime created) {
}
