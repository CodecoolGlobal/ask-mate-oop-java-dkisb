package com.codecool.askmateoop.dao.model.question;

import java.time.LocalDate;

public class Question {
    private int id;
    private String title;
    private String content;
    private LocalDate createdAt;
    private int user_id;

    public Question(int id, String title, String content, LocalDate createdAt, int user_id) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = createdAt;
        this.user_id = user_id;
    }

    public int getId() {
        return id;
    }
    public int getUser_id() {
        return user_id;
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
    public LocalDate getCreatedAt() {
        return createdAt;
    }
    public void setContent(String content) {
        this.content = content;
    }
}
