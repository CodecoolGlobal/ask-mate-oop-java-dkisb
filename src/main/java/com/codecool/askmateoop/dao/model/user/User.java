package com.codecool.askmateoop.dao.model.user;


import java.time.LocalDate;

public class User {
    private int id;
    private String username;
    private String password;
    private String email;
    private boolean isAdmin;
    private LocalDate createdAt;
    private int reliabilityPoints;

    public int getId() {
        return id;
    }
}
