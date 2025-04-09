package com.codecool.askmateoop.dao.model.user;

import com.codecool.askmateoop.controller.dto.user.NewUserDTO;

public interface UserDAO {
    boolean logInUser(String username, String password);
    int getReliabilityLevel(int id);
    void addUser(NewUserDTO newUser);
}
