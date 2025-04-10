package com.codecool.askmateoop.dao.model.user;

import com.codecool.askmateoop.controller.dto.user.LoginDTO;
import com.codecool.askmateoop.controller.dto.user.NewUserDTO;

public interface UserDAO {
    LoginDTO logInUser(String username, String password);
    int getReliabilityLevel(int id);
    boolean addUser(NewUserDTO newUser);
}
