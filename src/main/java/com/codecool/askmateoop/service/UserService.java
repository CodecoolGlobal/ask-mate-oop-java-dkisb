package com.codecool.askmateoop.service;


import com.codecool.askmateoop.dao.model.user.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    public boolean loginUser(String name, String password) {
        return userDAO.logInUser(name, password);
    }
}
