package com.codecool.askmateoop.dao.model.question;

import java.time.LocalDate;

public class Question {
    private int id;
    private String title;
    private String description;
    private LocalDate date;
    private int userId;

    public Question(int id, String title, String description, LocalDate date, int userId) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.userId = userId;

    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getUserId() {
        return userId;
    }
}