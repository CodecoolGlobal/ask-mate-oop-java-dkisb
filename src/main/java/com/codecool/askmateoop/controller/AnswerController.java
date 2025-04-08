package com.codecool.askmateoop.controller;

import com.codecool.askmateoop.controller.dto.answer.NewAnswerDTO;
import com.codecool.askmateoop.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/answer")
public class AnswerController {
    private final AnswerService answerService;

    @Autowired
    public AnswerController(AnswerService answerService) {
        this.answerService = answerService;
    }

    @PostMapping("/{question_id}")
    public ResponseEntity<Integer> addNewAnswer(@PathVariable("question_id") int questionId, @RequestBody NewAnswerDTO newAnswerDTO) {
        NewAnswerDTO answerToCreate = new NewAnswerDTO(
                newAnswerDTO.content(),
                questionId,
                newAnswerDTO.userId()
        );
        int newAnswerId = answerService.addNewAnswer(answerToCreate);
        if (newAnswerId > 0) {
            return new ResponseEntity<>(newAnswerId, HttpStatus.CREATED);
        } else  {
            return new ResponseEntity<>(-1, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
