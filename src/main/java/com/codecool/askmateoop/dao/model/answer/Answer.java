package com.codecool.askmateoop.dao.model.answer;

import java.time.LocalDate;


public class Answer {
    private int id;
    private String content;
    private LocalDate created_at;

    public int getId() {
        return id;
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
