package com.codecool.askmateoop.controller;

import com.codecool.askmateoop.controller.dto.answer.NewAnswerDTO;
import com.codecool.askmateoop.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/answer/{question_id}")
public class AnswerController {
    private final AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping("/")
    public ResponseEntity<NewAnswerDTO> addNewAnswer(@PathVariable int questionId, @RequestBody NewAnswerDTO answer) {
        NewAnswerDTO createdAnswer = answerService.addNewAnswer(answer,questionId);
        return new ResponseEntity<>(createdAnswer,HttpStatus.CREATED);
    }
}
