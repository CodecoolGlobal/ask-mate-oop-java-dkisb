package com.codecool.askmateoop.dao.model.question;

import java.time.LocalDate;

public record Question(
        int id,
        String title,
        String content,
        LocalDate createdAt,
        int userId
) {}
