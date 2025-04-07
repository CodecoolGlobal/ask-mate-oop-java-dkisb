package com.codecool.askmateoop.dao.model.answer;

import java.util.Date;

public record Answer(int id, String content, int userId, int questionId, Date createdAt) {
}
