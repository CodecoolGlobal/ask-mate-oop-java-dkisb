package com.codecool.askmateoop.dao.model.answer;

import java.util.Date;

public class Answer {
    private int id;
    private int questionId;
    private int userId;
    private String answer;
    private Date createdAt;

    Answer(int id, int questionId, int userId, String answer) {
        this.id = id;
        this.questionId = questionId;
        this.userId = userId;
        this.answer = answer;
        this.createdAt = new Date();
    }
}