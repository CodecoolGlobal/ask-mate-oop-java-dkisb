package com.codecool.askmateoop.dao.model.answer;

import java.time.LocalDate;


public class Answer {
    private int id;
    private String content;
    private LocalDate created_at;
    private int user_id;
    private int question_id;

    public int getId() {
        return id;
    }

    public int getUser_id() {
        return user_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public String getContent() {
        return content;
    }
    public LocalDate getCreated_at() {
        return created_at;
    }
    public void setContent(String content) {
        this.content = content;
    }

}
