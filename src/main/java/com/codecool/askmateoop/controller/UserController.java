
package com.codecool.askmateoop.controller;

import com.codecool.askmateoop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<Map<String, Boolean>> loginUser(@RequestBody Map<String, String> credentials) {
        String name = credentials.get("name");
        String password_hash = credentials.get("password_hash");
        if(name == null || password_hash== null) {
            return ResponseEntity.badRequest().body(Map.of("failed",false));
        } else {
            boolean isLoggedIn = userService.loginUser(name, password_hash);
            return isLoggedIn ? ResponseEntity.ok(Map.of("success", true)) : new ResponseEntity<>(HttpStatus.UNAUTHORIZED);
        }

    }
}
