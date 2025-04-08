package com.codecool.askmateoop.controller.dto.question;

import java.time.LocalDateTime;

public record QuestionDTO(String title, String content, LocalDateTime created) {}
