package com.codecool.askmateoop.dao.model.question;

import java.time.LocalDate;

public class Question {
    private int id;
    private String title;
    private String content;
    private LocalDate createdAt;
    private int userId;

    public Question(int id, String title, String content, LocalDate date, int userId) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.createdAt = date;
        this.userId = userId;

    }

    public int getId() {
        return id;
    }
    public int getUser_id() {
        return userId;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public int getUserId() {
        return userId;
    }
}