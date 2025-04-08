package com.codecool.askmateoop.dao.model.user;

public interface UserDAO {
    boolean logInUser(String username, String password);
    int getReliabilityLevel(int id);
}
