package com.codecool.askmateoop.dao.model.user;

import java.time.LocalDate;
import java.util.Date;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private boolean isAdmin;
    private LocalDate createdAt;

    public User(int id, String username, String password, String email, boolean isAdmin, LocalDate createdAt) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.isAdmin = isAdmin;
        this.createdAt = createdAt;
    }
    public int getId() {
        return id;
    }
}
