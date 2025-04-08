package com.codecool.askmateoop.dao.model.user;

import java.util.Date;

public record User(int id, String username, String password, String email, boolean isAdmin, Date createdAt) {
}
