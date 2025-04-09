package com.codecool.askmateoop.dao.model.answer;

import java.sql.Timestamp;
import java.time.LocalDate;


public class Answer {
    private int id;
    private String content;
    private Timestamp createdAt;
    private int userId;
    private int questionId;

   public Answer(int id, int questionId, int userId, String content) {
        this.id = id;
        this.questionId = questionId;
        this.userId = userId;
        this.content = content;
    }

    public int getId() {
        return id;
    }

}