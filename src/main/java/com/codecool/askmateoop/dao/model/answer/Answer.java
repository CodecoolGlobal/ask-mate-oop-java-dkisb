package com.codecool.askmateoop.dao.model.answer;

import java.time.LocalDate;


public class Answer {
    private int id;
    private String content;
    private LocalDate createdAt;
    private int userId;
    private int questionId;

    Answer(int id, int questionId, int userId, String content) {
        this.id = id;
        this.questionId = questionId;
        this.userId = userId;
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getContent() {
        return content;
    }
    public LocalDate getCreated_at() {
        return createdAt;
    }
    public void setContent(String content) {
        this.content = content;
    }

}