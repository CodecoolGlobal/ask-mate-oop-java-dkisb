package com.codecool.askmateoop.dao.model.question;

import java.time.LocalDate;

public class Question {
    private int id;
    private String title;
    private String content;
    LocalDate createdAt;

    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
